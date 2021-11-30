package com.example.SpringDataJPA.controller;

import com.example.SpringDataJPA.model.Customer;
import com.example.SpringDataJPA.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity save(@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable(required = true)long id) {
        return customerService.getId(id);

    }
    @GetMapping("/lastName")
    public void findByLastName(@RequestBody String lastName) {
        customerService.ultimoNome(lastName);
    }


}