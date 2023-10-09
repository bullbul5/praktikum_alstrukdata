import java.util.Scanner;
public class tahunKabisat {
public static void main (String[]args) {

int tahun;
Scanner input = new Scanner (System.in);
System.out.print ("Tahun:");
tahun = input.nextInt();

if (tahun %4 == 0 && tahun %100 != 0) {
System.out.println (tahun+ " adalah tahun kabisat");
} else if (tahun %100 == 0 && tahun %400 == 0) {
System.out.println (tahun+ " adalah tahun kabisat");
} else {
System.out.println (tahun+ " bukan tahun kabisat");
}
}
}