package com.deerwalk.LMS;

/**
 * Created by Dell on 9/20/2017.
 */
public class Librarian {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isAvailable()
    {
        boolean isAvailable=true;
        if(isAvailable==true)
        {
            System.out.println("The Book is available");
        }
        else{
            System.out.println("The Book is not available");
        }
        return isAvailable;
    }

    public void issueBook(){
        System.out.println("The book was issued");
    }



}
