public class ReverseManual {

  public static void main(String[] args) {
    String name = "devinbui";
    String ro_name = ReverseOrder(name);

    System.out.println("Name reverse = " + ro_name);
  }

  public static String ReverseOrder(String xname) {
    String backward = "";

    char chars[] = xname.toCharArray();

    for (int i = chars.length - 1; i >= 0; i--) { // descending
      //  for (int i = 0; i < chars.length; i++) { // ascending
      backward = backward + chars[i];
      System.out.println("value = " + chars[i]);
    }

    return backward;
  }
}
