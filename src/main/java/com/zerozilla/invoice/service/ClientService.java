package com.zerozilla.invoice.service;
import com.zerozilla.invoice.model.Client;


import java.util.List;

public interface ClientService {

  Client addClient(Client client);

  List<Client> findAll();

  Client getById(Long id);

  void deleteClient(Long id);

  Client updateClient(Client client,Long clientId);





}
