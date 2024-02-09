package com.newtechsoftmcservice.mcorderservice.repository;

import com.newtechsoftmcservice.mcorderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
