import java.util.Scanner;

public class PangkatRekursif {

    public static long pangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("FUNGSI REKURSIF UNTUK MENGHITUNG PANGKAT");
        System.out.println();
        System.out.print("Masukkan Nilai X = ");
        int x = input.nextInt();
        
        System.out.print("Masukkan Nilai Y = ");
        int y = input.nextInt();
        
        System.out.println();
        System.out.println(x + " Dipangkatkan " + y + " = " + pangkat(x, y));
    }
}
