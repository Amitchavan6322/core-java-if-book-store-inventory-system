package com.amit.book.inventory.service;


import com.amit.book.inventory.model.BookInfo;

import java.util.Scanner;

public class BookService {

    public BookInfo acceptingBookInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter book Name");
        String name = scanner.nextLine();

        System.out.println("Enter book Author");
        String author = scanner.nextLine();

        System.out.println("Enter book Publication");
        String publication = scanner.nextLine();

        System.out.println("Enter book language");
        String language = scanner.nextLine();

        System.out.println("Enter book category");
        String category = scanner.nextLine();

        // initialize entities
        BookInfo book = new BookInfo();

        book.setBookID(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPublication(publication);
        book.setLanguage(language);
        book.setCategory(category);

        return book;
    }
}
