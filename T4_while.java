import java.util.Scanner;
public class T4_while {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	
    int number = 0;
    int sum = 0;
    int rata = 0;
    int count = 0;

    while (count < 5) { 
      System.out.print("Masukkan bilangan: ");
      number = scanner.nextInt();
      sum += number;
      count++;
    }
    rata = sum / 5;
    System.out.println("Total: " + sum);
    System.out.println("Rata-rata: " + rata);
  }

}