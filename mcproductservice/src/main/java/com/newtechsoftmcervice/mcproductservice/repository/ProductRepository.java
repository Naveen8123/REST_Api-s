package com.newtechsoftmcervice.mcproductservice.repository;

import com.newtechsoftmcervice.mcproductservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
