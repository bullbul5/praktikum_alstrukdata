import java.util.Scanner;
public class suhu {
public static void main (String[]args) {

int suhu;
Scanner input = new Scanner (System.in);
System.out.print ("Suhu: ");
suhu = input.nextInt();
if (suhu < 0) {
System.out.println("Merupakan benda padat");
} else if (suhu >=0 && suhu <= 100) {
System.out.println ("Merupakan benda cair");
} else {
System.out.println("Merupakan benda gas");
}
}
}