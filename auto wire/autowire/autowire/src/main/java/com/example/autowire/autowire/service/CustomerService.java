package com.example.autowire.autowire.service;

import com.example.autowire.autowire.model.customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    private  static List<customer>customerList=new ArrayList<customer>();
    static {
        customer cust=new customer();
        cust.setId(1);
        cust.setName("shalini");
        cust.setAge(27);
        cust.setLocation("chennai");
        customerList.add(cust);
        System.out.println();

        cust=new customer();
        cust.setId(2);
        cust.setName("rino");
        cust.setAge(25);
        cust.setLocation("tn");
        customerList.add(cust);

        cust=new customer();
        cust.setId(3);
        cust.setName("aji");
        cust.setAge(20);
        cust.setLocation("kk");
    }

    public static List<customer> getCustomerList() {
        return customerList;
    }
}


