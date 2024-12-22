package com.amit.book.inventory.service;


import com.amit.book.inventory.model.Book;

import java.util.Scanner;

public class BookService {

    public Book acceptingBookInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter book Name");
        String name = scanner.nextLine();

        System.out.println("Enter book Author");
        String author = scanner.nextLine();

        System.out.println("Enter book Publisher");
        String publisher = scanner.nextLine();

        System.out.println("Enter no of book copies");
        int noOfCopies = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter book category");
        String category = scanner.nextLine();

        System.out.println("Enter book store location");
        String storeLocation = scanner.nextLine();

        System.out.println("Enter book price");
        int price = Integer.parseInt(scanner.nextLine());

        // initialize entities
        Book book = new Book();

        book.setBookID(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setNoOfCopies(noOfCopies);
        book.setCategory(category);
        book.setStoreLocation(storeLocation);
        book.setPrice(price);

        return book;
    }
}
