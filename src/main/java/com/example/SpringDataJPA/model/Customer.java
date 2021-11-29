package com.example.SpringDataJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // entidade do banco de dados
public class Customer {

    @Id //identificador
    @GeneratedValue(strategy = GenerationType.AUTO) //colocar automaticamente os valores da tabela no banco de dados
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {
    }

    // construtor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    } // retorna os atributos dos clientes em string

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}