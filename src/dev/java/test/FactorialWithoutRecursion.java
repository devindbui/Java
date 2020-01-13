package dev.java.test;


//How to find factorial of a number using recursion ?

public class FactorialWithoutRecursion {
	  public static void main(String[] args) {
	        System.out.println("5!  = " + factorial(5));
	    }
	    
	    private static long factorial(int num){
	        long fact =1;
	        while(num > 0){
	            fact *= num--;
	        }
	        return fact;
	    }
}

/**
Recursion

Recursion is a process of a method calling itself.
 
Recursion can be used to solve problems where a logic needs to executed repeatedly for a smaller set.
 
For example, we can recursion to find the factorial of number.
 
Factorial of a number, n is expressed as n! and can be calculated as :
 
n! = n * (n-1) * (n-2) � * 2 * 1
 
Lets first see how to calculate factorial without using recursion.
**/