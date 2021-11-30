package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Iterable<Customer>findByLastName(String lastName);

    Customer findById(long id);



}

