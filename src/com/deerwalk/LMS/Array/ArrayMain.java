package com.deerwalk.LMS.Array;

/**
 * Created by Dell on 9/22/2017.
 */
public class ArrayMain {
    public static void main(String[] args) {
        int[]appleBasket=new int[5];//initialize array
        //int[]game={1,2,3,4,5,6};//another way to initialize.
           appleBasket[0]=100;
           appleBasket[1]=200;
           appleBasket[2]=300;
           appleBasket[3]=400;
           appleBasket[4]=500;

        for(int i=0;i<appleBasket.length;i++)
        {
            System.out.println("appleBasket"+appleBasket[i]);
        }
        //enhanced for loop => foreach, same as mathi ko
        for(int apple:appleBasket){
            System.out.println("apple");
        }

        int[]alternativeAppleBasket={100,200,300,400,500};
        for(int apple:alternativeAppleBasket)
        {
            System.out.println(apple);
        }

    }


}
