package com.deerwalk.LMS;

/**
 * Created by Dell on 9/20/2017.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.security.spec.ECField;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input=0;

        do{

            System.out.println("Enter\n1 for Librarian\n2 for Student");
            int select=scanner.nextInt();
            if(select==1) {

                System.out.println("Enter the operation you want to do:\n1.Add Book\n2.Check availability\n3.Issue Book\n4.Exit ");
                input = scanner.nextInt();
                switch (input) {
                    case 1:


                        String author;
                        Exception e1 = null;
                        double price = 0.0;
                        Book book = new Book();

                        System.out.println("Enter the book you want to add:");
                        String name = scanner.next();
                        System.out.println("Enter the name of the author:");
                        author = scanner.next();
                        System.out.println("Enter the price of the book:");
                        do {
                            try {

                                e1 = null;
                                price = 0.0;
                                price = scanner.nextDouble();

                            } catch (Exception e) {
                                System.out.println(e);
                                e.getMessage();
                                e1 = e;


                            }
                        }
                        while (e1 != null);


                        book.setName(name);
                        book.setAuthor(author);

                        book.setPrice(price);

                        book.addBook(book);


                        break;


                    case 2:

                        Librarian librarian = new Librarian();
                        System.out.println("Enter the name go the book");
                        name = scanner.next();
                        librarian.setName(name);
                        librarian.isAvailable();
                        break;

                    case 3:
                        librarian = new Librarian();
                        System.out.println("Enter the name of the book");
                        name = scanner.next();
                        librarian.setName(name);
                        librarian.issueBook();
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                }

            if(select==2)
            {
                System.out.println("Enter the operation you want to perform:\n1.Query book\n2.Exit");
                        input=scanner.nextInt();
                switch(input) {
                    case 1:
                        Student student = new Student();
                        System.out.println("Enter the name of the book");
                        String name = scanner.next();
                        student.queryBook();
                        break;
                    default:
                        System.out.println("Invalid Input!!");
                        break;
                }


            }
        }while(input!=5);
    }




}
