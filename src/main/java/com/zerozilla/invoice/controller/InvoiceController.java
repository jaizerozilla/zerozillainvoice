package com.zerozilla.invoice.controller;

import com.zerozilla.invoice.apiresponse.ApiResponse;
import com.zerozilla.invoice.model.Client;
import com.zerozilla.invoice.model.Invoice;
import com.zerozilla.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/add")
    public ResponseEntity<Invoice> addInvoice(@RequestBody Invoice invoice){

        Invoice newInvoice = this.invoiceService.saveInvoice(invoice);
        return new ResponseEntity<>(newInvoice, HttpStatus.CREATED);
    }


    @GetMapping("/single/{id}")
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable Long id){
      Invoice invoice = this.invoiceService.getInvoiceById(id);
      return new ResponseEntity<>(invoice,HttpStatus.OK) ;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse> deleteInvoice(@PathVariable Long id) {
        this.invoiceService.deleteInvoice(id);
        return new ResponseEntity<ApiResponse>
                (new ApiResponse("Invoice is deleted successfully", true), HttpStatus.OK);
      }
    @GetMapping("/all")
    public ResponseEntity<List<Invoice>> getAllInvoice(){
        List<Invoice> allInvoice = invoiceService.allInvoice();
        return new ResponseEntity<>(allInvoice, HttpStatus.OK);
      }

    }
