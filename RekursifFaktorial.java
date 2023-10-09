import java.util.Scanner;

public class RekursifFaktorial{
 
	public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.print("Masukkan Angka: ");
	int n = inputScanner.nextInt();
	int hasil = rekursif(n);
	System.out.print(" " + hasil);
}
public static Integer rekursif(int n){
	if(n == 0 || n == 1){
	return 1;
}	
else{
return n* rekursif(n-1);
     }
   }
}
