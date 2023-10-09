import java.util.Scanner;
 
public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PALINDROME CHECKER");
        System.out.println("==================");
        System.out.print("\nInput kalimat: ");
        String kata = input.nextLine();
        input.close(); // Menutup Scanner setelah penggunaan selesai
 
        if (kataPalindrome(kata)) {
            System.out.println(kata + " adalah Palindrome");
        } else {
            System.out.println(kata + " Bukan Palindrome");
        }
    }
    static boolean kataPalindrome(String kata) {
        int left = 0;
        int right = kata.length() - 1;
        while (left < right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}