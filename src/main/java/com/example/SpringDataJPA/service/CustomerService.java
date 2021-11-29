package com.example.SpringDataJPA.service;

import com.example.SpringDataJPA.controller.CustomerController;
import com.example.SpringDataJPA.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@RequiredArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerController customerController;

    public void salvar(Customer customer) {
        customerController.findAll(customer);
    }

    public Customer getId(long id) {
        return customerController.findById(id);
    }

    public void ultimoNome(String lastName) {
        customerController.findByLastName(lastName);
    }

    public Customer save(Customer customer) {
    }
}
