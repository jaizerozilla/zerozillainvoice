package com.zerozilla.invoice.repo;

import com.zerozilla.invoice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
