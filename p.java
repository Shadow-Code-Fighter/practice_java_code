
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            System.out.println(reversed);
            n /= 10;
            System.out.println(n);
        }

        System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}
