public class T4_No1 {

  public static void main(String[] args) {
    for (int a = 0; a < 1000; a++) {
      for (int b = a + 1; b < 1000; b++) {
        double result = (a * a + b * b + 1) / (a * b);
        if (result % 1 == 0) {
          System.out.println("(" + a + ", " + b + ") => " + result);
        }
      }
    }
  }

}