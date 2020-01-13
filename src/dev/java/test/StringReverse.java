package dev.java.test;

public class StringReverse {
	 
    public static void main(String[] args) {
        System.out.println("Reverse of string topjavatutorial is = " + reverseString("topjavatutorial") );
    }
 
    public static String reverseString(String source){
        int length= source.length();
        StringBuilder dest = new StringBuilder(length);
        
        for(int i=source.length()-1;i>=0;i--){
            dest.append(source.charAt(i));
        }
        
        return dest.toString();
    }
    /***   
    public class StringReverse {
   	 
        public static void main(String[] args) {
            String str = "topjavatutorial";
            System.out.println(reverse(str)); // lairotutavajpot
        }
     
        private static String reverse(String str){
            char[] arr = str.toCharArray();
            String rvStr="";
            for(int i=arr.length-1;i>=0;i--)
                rvStr+=arr[i]; // Should use StringBuilder instead.. see below example
            return rvStr;
        }
    }
    ***/
}
