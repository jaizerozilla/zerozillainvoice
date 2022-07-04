package com.zerozilla.invoice.controller;

import com.zerozilla.invoice.apiresponse.ApiResponse;
import com.zerozilla.invoice.model.Client;
import com.zerozilla.invoice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @PostMapping("/add")
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        Client add = this.clientService.addClient(client);
        return new ResponseEntity<>(add, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Client>> getAllClient(){
        List<Client> allclient = clientService.findAll();
        return new ResponseEntity<>(allclient, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse> deleteClient(@PathVariable Long id){
       this.clientService.deleteClient(id);
        return new ResponseEntity<ApiResponse>
                (new ApiResponse("Client is deleted successfully",true), HttpStatus.OK);

    }

    @PutMapping("/update/{clientId}")
    public ResponseEntity<Client> updateClient(@RequestBody Client client, @PathVariable Long clientId){
        Client updateClient = this.clientService.updateClient(client,clientId);
        return new ResponseEntity<Client>(updateClient,HttpStatus.OK);
    }

}
