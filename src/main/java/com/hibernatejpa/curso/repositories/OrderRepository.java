package com.hibernatejpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernatejpa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    

}
