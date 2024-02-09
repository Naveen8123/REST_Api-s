package com.newtechsoftmcervice.mcproductservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Documented;
import java.math.BigDecimal;
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
 @Data
 @Entity
 @Table(name="product")
public class Product {
     @Id
     @GeneratedValue
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}
