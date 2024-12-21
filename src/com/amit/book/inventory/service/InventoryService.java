package com.amit.book.inventory.service;

import com.amit.book.inventory.model.InventoryInfo;

import java.util.Scanner;

public class InventoryService {

    public InventoryInfo acceptingInventory(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter inventory id");
        int invID = Integer.parseInt(scanner.nextLine());

        System.out.println("enter book quantity");
        int bookQnt = Integer.parseInt(scanner.nextLine());

        // initialize entities
        InventoryInfo inventory = new InventoryInfo();
        inventory.setInvID(invID);
        inventory.setBookQuantity(bookQnt);

        // We are returning an instance of the InventoryInfo class
        return inventory;

    }


}
