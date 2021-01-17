package com.naidachang.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.naidachang.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
