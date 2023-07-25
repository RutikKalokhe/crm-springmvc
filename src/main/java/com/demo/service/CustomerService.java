package com.demo.service;

import java.util.List;

import com.demo.entity.Customer;

/**
 * Created by Amit Pisal
 */

public interface CustomerService {

    void addCustomer(Customer customer);
    Customer getCustomer(int id);
    List<Customer> getCustomers(int sortBy);
    void deleteCustomer(int id);
    List<Customer> searchCustomer(String searchString);
}
