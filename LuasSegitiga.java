import java.util.Scanner;

public class LuasSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.printf("Luas segitiga: %.2f", luas);
    }
}