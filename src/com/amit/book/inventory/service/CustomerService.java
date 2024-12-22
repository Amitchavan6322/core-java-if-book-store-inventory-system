package com.amit.book.inventory.service;

import com.amit.book.inventory.model.Customer;

import java.util.Scanner;

public class CustomerService {

    public Customer acceptingCustomerInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer id");
        int customerId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter customer name");
        String name = scanner.nextLine();

        System.out.println("Enter customer address");
        String address = scanner.nextLine();

        System.out.println("Enter customer contact");
        Long contact = Long.valueOf(scanner.nextLine());

        System.out.println("Enter customer Email ID");
        String emailID = scanner.nextLine();

        Customer customer = new Customer();
        customer.setCustomerID(customerId);
        customer.setCustomerName(name);
        customer.setCustomerAddress(address);
        customer.setCustomerContact(contact);
        customer.setEmailID(emailID);

        return customer;
    }
}
