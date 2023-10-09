import java.util.Scanner;
public class lampu {
public static void main (String[]args) {

String warna;
Scanner input = new Scanner (System.in);
System.out.print ("Warna: ");
warna = input.next();

if (warna.equals("merah")){
System.out.println ("Berhenti!");
} else if (warna.equals("kuning")) {
System.out.println ("Hati-hati!");
} else if (warna.equals("hijau")){
System.out.println ("Jalan!");
}else {
System.out.println ("Warna Salah!");
}
}
}