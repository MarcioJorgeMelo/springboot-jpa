package com.hibernatejpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernatejpa.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    

}
