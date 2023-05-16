package org.example;

import java.util.Scanner;

public class whileLoop {
//    Write a program to print numbers from 1 to 10
    public static void main(String[] args) {
        int i = 1;
        while ( i <=10)
        {
            System.out.print(i +" ");
            i++;
        }
//        Write a program to calculate the sum of first 10 natural number.
        int sum = 0;
        for (int j=1; j<=10; j++)
        {
            sum += j;
        }
        System.out.println("Sum: " + sum);

        int sumNum = 0;
        for(int k =1;k<10;k++){
            sumNum += k;
        }
        System.out.print (sumNum +" ");

//        Write a program that prompts the user to input a positive integer. It should then print the
//        multiplication table of that number.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a positive integer: ");
        Integer num = scanner.nextInt();
        System.out.println("Multiplication of " + num);

         for(int b=1; b<=20; b++){
            System.out.println(num + "x" + b + "=" + (num*b));
        }


    }
}