package com.zerozilla.invoice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prod_tab")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id_col")
    private Long id;

    @Column(name = "prod_description_col")
    private String description;

    @Column(name = "prod_qty_col")
    private int qty;

    @Column(name = "prod_unitPrice_col")
    private Double unitPrice;

//  @ManyToOne(cascade = CascadeType.ALL,targetEntity = "products")
//  private Invoice invoice;



}

