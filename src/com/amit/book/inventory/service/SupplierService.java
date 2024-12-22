package com.amit.book.inventory.service;

import com.amit.book.inventory.model.Supplier;

import java.util.Scanner;

public class SupplierService {

    public Supplier acceptingSupplierInformation(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter supplier id");
        int supplierId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter supplier name");
        String name = scanner.nextLine();

        System.out.println("Enter supplier address");
        String address = scanner.nextLine();

        System.out.println("Enter supplier contact number");
        Long contact = Long.valueOf(scanner.nextLine());

        System.out.println("Enter supplier Email ID");
        String emailID = scanner.nextLine();

        Supplier supplier = new Supplier();
        supplier.setSupplierID(supplierId);
        supplier.setSupplierName(name);
        supplier.setSupplierAddress(address);
        supplier.setSupplierContact(contact);
        supplier.setSupplierEmailId(emailID);

        return supplier;

    }
}
