package dev.java.interview;

//How to find the sum of digits of a number using recursion ?

import java.util.Scanner;

public class SumofDigitsUsingRecursion {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        System.out.println("Sum of digits of "+num + " is " + sum(num));
        
        sc.close();
    }
    
    public static int sum(int n){
        return n==0 ? 0 : n%10+sum(n/10);
    }
 
}
/***
Enter a number

123
 
Sum of digits of 123 is 6
***/