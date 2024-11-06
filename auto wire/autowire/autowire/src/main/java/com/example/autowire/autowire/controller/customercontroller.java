package com.example.autowire.autowire.controller;

import com.example.autowire.autowire.model.customer;
import com.example.autowire.autowire.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class customercontroller {
    @Autowired
    CustomerService customerService;

    @GetMapping("/list")
    public List<customer> getcustomerList() {
        return CustomerService.getCustomerList();


    }
}
