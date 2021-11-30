package com.example.SpringDataJPA.service;

import com.example.SpringDataJPA.model.Customer;
import com.example.SpringDataJPA.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public void save(Customer customer) {
       customerRepository.save(customer);
//        customerController.findAll(customer);
    }

    public Customer getId(long id) {
        return customerController.findById(id);
    }

    public void ultimoNome(String lastName) {
        customerController.findByLastName(lastName);
    }


}
