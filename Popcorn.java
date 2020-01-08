public class Popcorn{

  public static void main(String [] args){

  long beginTime = System.nanoTime();

    int n = 100;
    String x = "pop";
    String y = "corn";
    String z = x + y;
    int countx = 0;
    int county = 0;
    int countz = 0;

    for (int i = 1; i <= n; i++){
      if (i % 15 == 0){
        System.out.println(z + " = " + i);
        countz = countz + 1;
      }else if (i % 5 ==0) {
        System.out.println(y + " = " + i);
        county = county + 1;
      }else if (i % 3 == 0){
        System.out.println(x + " = " + i);
        countx = countx + 1;
      }
      }
      System.out.println("pop repeated = " + countx);
      System.out.println("corn repeated = " + county);
      System.out.println("popcorn repeated = " + countz);
      long endTime = System.nanoTime();
      long time = endTime - beginTime;
      time = time/100000000;
      System.out.println("Time elapse = " + time +  "seconds");
    }


  }
