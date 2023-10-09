import java.util.Scanner;
public class Evaluasi {
    public void prosesHasilUjian() {
        Scanner input = new Scanner(System.in);
        
        int jumlahLulus = 0;
        int jumlahGagal = 0;
        int counterSiswa = 1;
        int hasil;

        while (counterSiswa <= 8) {
            System.out.print("Masukkan hasil ujian (1 = lulus atau 2 = gagal): ");
            hasil = input.nextInt();

            if (hasil == 1) {
                jumlahLulus = jumlahLulus + 1;
            } else {
                jumlahGagal = jumlahGagal + 1;
            }
            counterSiswa = counterSiswa + 1;
        }
        System.out.printf("Lulus: %d\nGagal: %d\n", jumlahLulus, jumlahGagal);

        if (jumlahLulus > 4) {
            System.out.println("Kursus telah berhasil!");
        } else {
            System.out.println("Kursus tidak berhasil!");
        }
    }
    public static void main(String[] args) {
        Evaluasi evaluasi = new Evaluasi();
        evaluasi.prosesHasilUjian();
    }
}
