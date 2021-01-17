package com.naidachang.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.naidachang.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
