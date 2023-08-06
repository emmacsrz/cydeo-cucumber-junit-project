package com.cydeo.pages;

public class QuickPractice {
    public static void main(String[] args) {
        //swapping 2 variables with a temp variable

        int a = 10;
        int b=5;
        System.out.println("a = "+ a);
        System.out.println("b = "+b);

        int temp = a;
        a = b;
        b= temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+b);

        //swapping 2 variables without a temp variable:
        System.out.println();
        System.out.println();
        int x = 5;
        int y = 10;
        System.out.println("x = "+ x);
        System.out.println("y = "+y);

         x= x+y; // 5 = 5 + 10 (15)
         y=x-y;// 10 = 15 - 10 (5)
         x= x-y; //15 = 15 - 5 (10)

        System.out.println("x = "+ x);
        System.out.println("y = "+y);

        System.out.println();
        System.out.println();
        //swapping 2 char variables with char

        String str1 = "a";
        String str2 = "b";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        String strTemp = str2;
        str2= str1;
        str1 = strTemp;
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);





    }
}
