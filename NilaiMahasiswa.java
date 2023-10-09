import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda (dalam angka): ");
        int nilai = input.nextInt();
        String nilaiHuruf;

        if (nilai >= 85 && nilai <=100) {
            nilaiHuruf = "A";
        } else if (nilai >= 75 && nilai <= 84) {
            nilaiHuruf = "AB";
        } else if (nilai >= 65 && nilai <= 74) {
            nilaiHuruf = "B";
        } else if (nilai >= 50 && nilai <= 64) {
            nilaiHuruf = "BC";
        } else if (nilai >= 35 && nilai <= 49) {
            nilaiHuruf = "C";
        } else if (nilai >= 20 && nilai <= 34) {
            nilaiHuruf = "D";
        } else if (nilai >= 0 && nilai <= 19) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai tidak valid";
        }

        System.out.println("Nilai Anda adalah " + nilaiHuruf);

        input.close();
    }
}
