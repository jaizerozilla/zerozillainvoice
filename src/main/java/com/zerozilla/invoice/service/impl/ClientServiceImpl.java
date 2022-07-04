package com.zerozilla.invoice.service.impl;

import com.zerozilla.invoice.exception.ResourceNotFoundException;
import com.zerozilla.invoice.model.Client;
import com.zerozilla.invoice.repo.ClientRepository;
import com.zerozilla.invoice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client addClient(Client client) {
      return clientRepository.save(client);

    }

    @Override
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client getById(Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(()->new ResourceNotFoundException("Client","Id",clientId));
        return client;
    }

    @Override
    public void deleteClient(Long id) {
        Client client = this.clientRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Client","Id",id));
    clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client client, Long clientId) {

        Client client1= (this.clientRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId)));
          client1.setCompanyName(client.getCompanyName());
          //client1.setCity(client.getCity());
          client1.setAddress(client.getAddress());
          client1.setEmail(client.getEmail());
          client1.setGstNumber(client1.getGstNumber());
        //  client1.setCity(client.getCity());
          client1.setMobile(client.getMobile());

          Client updatedclient  = this.clientRepository.save(client1);

        return updatedclient;
    }
}
