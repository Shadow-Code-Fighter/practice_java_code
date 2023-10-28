import java.util.Scanner;

public class SumBinary {
    public static void main(String[] args) {
        int i = 0, raminder = 0;
        int sum[] = new int[20];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first binary number");
        long binary1 = sc.nextLong();
        System.out.println("enter second binary number");
        long binary2 = sc.nextLong();

        while (binary1 != 0 && binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + raminder) % 2);
            raminder = (int) ((binary1 % 10 + binary2 % 10 + raminder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (raminder != 0) {
            sum[i++] = raminder;
        }
        --i;

        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");

    }
}
