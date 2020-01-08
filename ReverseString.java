public class ReverseString {

  public static void main(String[] args) {
    String original_string = "bmw";
    String reverse_string = Flip(original_string);
    System.out.println(
        "The orignal string = \'"
            + original_string
            + "\' and new reverse is \'"
            + reverse_string
            + "\'");
  }

  public static String Flip(String original) {
    String reverse_string;
    //  System.out.println("************* original = " + original);
    StringBuilder str = new StringBuilder();
    str.append(original);
    reverse_string = str.reverse().toString();
    return reverse_string;
  }
}
