package com.demo.service;

import com.demo.dao.CustomerDAO;
import com.demo.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Amit Pisal
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }

    @Override
    @Transactional
    public List<Customer> getCustomers(int sortBy) {
        return customerDAO.getCustomers(sortBy);
    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }

    @Override
    @Transactional
    public List<Customer> searchCustomer(String searchString) {
        return customerDAO.searchCustomer(searchString);
    }

    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
