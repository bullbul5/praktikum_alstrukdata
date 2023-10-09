public class CetakAngka {
    piblic static void main (String [] args){
         cetakAngka(1);
     }
     static void cetakAngka(int angka) {
        if (angka <=10) {
             System.out.print(angka + " ");
            cetakAngka (++angka);
         }
     }
}