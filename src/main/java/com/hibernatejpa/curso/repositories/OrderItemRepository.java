package com.hibernatejpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernatejpa.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    

}
