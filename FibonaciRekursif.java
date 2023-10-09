import java.util.Scanner;

public class FibonaciRekursif {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukan Batas: ");
        int batas = inputScanner.nextInt();

        for (int i = 0; i < batas; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(hasil + " ");
        }
    }

    public static int fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
}
