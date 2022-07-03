package com.deerwalk.LMS;

/**
 * Created by Dell on 9/20/2017.
 */
import java.util.Scanner;
public class Book {
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void addBook(Book book){
        System.out.println(book.getName() + " "+ book.getAuthor() +" "+ book.getPrice());
        System.out.println("The book has been successfully added!!!");

    }


}
