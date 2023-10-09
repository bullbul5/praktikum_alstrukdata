import java.util.Scanner;
public class CetakSegitigaSiku {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukan row: ");
		int row = scanner.nextInt();
		System.out.println("Masukan col: ");
		int col = scanner.nextInt();
		System.out.println("Masukan batas: ");
		int batas = scanner.nextInt();
		cetakSegitigaSiku(row,col,batas);
    }
	
    static void cetakSegitigaSiku(int row, int col, int batas) {
        if (row <= batas) {
            if (col <= row) {
                System.out.print("* ");
            }
            if (col == row) {
                System.out.println();
                cetakSegitigaSiku(++row, 1, batas);
            }
            else {
                cetakSegitigaSiku(row, ++col, batas);
            }
        }
    }
}
