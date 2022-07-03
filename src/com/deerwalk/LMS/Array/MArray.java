package com.deerwalk.LMS.Array;

/**
 * Created by Dell on 10/2/2017.
 */
public class MArray {
    public static void main(String[] args) {
        int [][] table=new int [2][4];
        table[0][0]=10;
        table[0][1]=20;
        table[0][2]=30;
        table[0][3]=40;
        table[1][0]=50;
        table[1][1]=60;
        table[1][2]=70;
        table[1][3]=80;

        for (int i=0;i<2;i++){
            for(int j=0;j<4;j++) {
                System.out.println("Number:" +table[i][j]);
            }
        }
    }
}
