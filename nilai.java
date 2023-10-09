import java.util.Scanner;
public class nilai {
public static void main (String[]args) {

int a,b,c;
Scanner input = new Scanner (System.in);
System.out.print("Masukan nilai a: ");
a = input.nextInt();
System.out.print("Masukan nilai b: ");
b = input.nextInt();
System.out.print("Masukan nilai c: ");
c = input.nextInt();
 if (a > b && a > c) {
 System.out.println("Nilai a merupakan nilai terbesar");
 } else if (b > a && b > c) {
 System.out.println("Nilai b merupakan nilai terbesar");
 } else {
 System.out.println("Nilai c merupakan nilai terbesar");
 }
 }
 }