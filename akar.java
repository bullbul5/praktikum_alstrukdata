import java.util.Scanner;
public class akar {
public static void main (String[]args) {

double a,b,c,det,x1,x2;
Scanner input = new Scanner(System.in);
System.out.print ("Masukan nilai a: ");
a = input.nextDouble();
System.out.print ("Masukan nilai b: ");
b = input.nextDouble();
System.out.print ("Masukan nilai c: ");
c = input.nextDouble();

det =(b*b - 4*a*c);

if (det < 0) {
System.out.println("Akar-akar imaginer");
} else if (det == 0) {
x1 =(-b/(2*a));
System.out.println("akar-akar ganda (x1=x2) yaitu: " +x1);
} else { 
x1 =(-b + Math.sqrt(det))/2*a;
x2 =(-b - Math.sqrt(det))/2*a;
System.out.println("Ada 2 akar yang berbeda yaitu x1 = " +x1+ " dan x2 = "+x2);
}
}
}