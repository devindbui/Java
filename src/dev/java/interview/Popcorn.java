package dev.java.interview;

public class Popcorn {
	public static void main(String args[]) {
		int i;
		String finalvalue = "";
		for (i = 1; i<=100; i++) {
			finalvalue = textValue(i);
		System.out.print("Value = "+finalvalue+ "\n");
		}
	}
	private static String textValue(int num){
		String value;
		if (num % 15 == 0){
			value = "popcorn";
		}else if(num % 5 == 0){
			value = "corn";
		}else if(num % 3 == 0){
			value = "pop";
		}else {
			value = String.valueOf(num) ;
		}		
		return value;
	}


}
