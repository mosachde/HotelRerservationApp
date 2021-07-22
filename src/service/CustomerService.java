package service;

import model.Customer;
import model.exception.CustomerExistException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CustomerService {

    private static Map<String, Customer> customerMap = new HashMap<>();

    public void addCustomer(String email, String firstName, String lastName) throws CustomerExistException {

        if (customerMap.get(email.trim().toLowerCase()) == null) {

            customerMap.put(email.trim().toLowerCase(Locale.ROOT), new Customer(firstName, lastName, email));
        }else {
            throw  new CustomerExistException("Customer Already Exists with this Email Address");
        }
    }

    public Customer getCustomer(String email) {

        return customerMap.get(email);
    }

    public Collection<Customer> getAllCustomers() {

        return customerMap.values();
    }
}



