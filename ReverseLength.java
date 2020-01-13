import java.util.*;

public class ReverseLength {

  public static void main(String[] args) {
    String value = "";
    System.out.println("Enter the string to be reversed");

    
    try (Scanner input = new Scanner(System.in)) {
		String original = input.nextLine();

		int length = original.length();

		for (int x = length - 1; x >= 0; x--) {
		  value = value + original.charAt(x);
		}
	}
    
    System.out.println("Reverse = " + value);
  }
}
