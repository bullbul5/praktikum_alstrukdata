import java.util.Scanner;

public class T4_dowhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = 0;
    int sum = 0;
    String input;

    do {
      System.out.print("Masukkan bilangan: ");
      number = scanner.nextInt();

      sum += number;

      System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
      input = scanner.next();
    } while (input.equals("y"));

    System.out.println("Total: " + sum);
  }

}
