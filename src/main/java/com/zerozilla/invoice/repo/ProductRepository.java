package com.zerozilla.invoice.repo;

import com.zerozilla.invoice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
