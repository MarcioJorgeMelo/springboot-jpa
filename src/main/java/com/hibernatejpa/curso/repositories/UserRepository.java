package com.hibernatejpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernatejpa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    

}
