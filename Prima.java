import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        boolean prima = false;
        System.out.print("Masukan angka: ");
        int bil = inputScanner.nextInt();

        if (bil == 2) {
            prima = true;
        } else {
            prima = true;
            for (int i = 2; i < bil; i++) {
                if (bil % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println(bil + " Bilangan Prima");
        } else {
            System.out.println(bil + " Bukan bilangan Prima");
        }
    }
}
