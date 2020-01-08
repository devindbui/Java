package dev.java.interview;
//package may not work

public class FactorialUsingRecursion {
String in = "test";
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    private static long factorial(int num){
        if(num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
}
