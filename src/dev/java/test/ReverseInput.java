package dev.java.test;
import java.util.*;

public class ReverseInput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your string");
    String str = scanner.nextLine();
    String[] token = str.split("");
    String total = "";
    for (int i = token.length - 1; i >= 0; i--) {
      System.out.println("value = " + token[i]);
      total = total + token[i];
    }
    System.out.println("Full value = " + total);
  }
}
