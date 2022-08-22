package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.exceptions.*;
import org.academiadecodigo.hackathon.persistence.dao.CustomerDao;
import org.academiadecodigo.hackathon.persistence.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    /**
     * Sets the customer data access object
     *
     * @param customerDao the account DAO to set
     */
    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    /**
     * Sets the account data access object
     *
     * @param accountDao the account DAO to set
     */

    /**
     * @see CustomerService#get(Integer)
     */
    @Override
    public Customer get(Integer id) {
        return customerDao.findById(id);
    }

    /**
     * @see CustomerService#save(Customer)
     */
    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customerDao.saveOrUpdate(customer);
    }

    /**
     * @see CustomerService#delete(Integer)
     */
    @Transactional
    @Override
    public void delete(Integer id) throws CustomerNotFoundException, AssociationExistsException {

        customerDao.delete(id);
    }

    /**
     * @see CustomerService#list()
     */
    @Override
    public List<Customer> list() {
        return customerDao.findAll();
    }

    @Transactional
    @Override
    public List<Customer> findAllCustomer2(Integer age, String firstName, String lastName, Integer bi, String phone, String location, String gender) {
        return customerDao.findAllCustomer2(age, firstName, lastName, bi, phone, location, gender);

    }

}