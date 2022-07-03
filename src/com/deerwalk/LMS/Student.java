package com.deerwalk.LMS;

/**
 * Created by Dell on 9/20/2017.
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void queryBook() {
        Librarian librarian =new Librarian();
        if (librarian.isAvailable()) {
            System.out.println("The book is available");

        } else {
            System.out.println("The book is not available");

        }
    }
}




