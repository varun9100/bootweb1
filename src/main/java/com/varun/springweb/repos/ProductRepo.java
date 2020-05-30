package com.varun.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.springweb.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
