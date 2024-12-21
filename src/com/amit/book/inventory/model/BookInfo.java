package com.amit.book.inventory.model;

public class BookInfo {
    private int bookID;
    private String Name;
    private String author;
    private String publication;
    private String language;
    private String category;

    @Override
    public String toString() {
        return "InventoryInfo{" +
                "bookID=" + bookID +
                ", Name='" + Name + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", language='" + language + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
