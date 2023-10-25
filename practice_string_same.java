import java.util.Scanner;

public class practice_string_same {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 1st keyword:");
                String str = sc.nextLine();
                System.out.println("Enter 2nd keyword:");
                String str1 = sc.nextLine();
                int c1 = 0;

                if (str.length() != str1.length()) {
                        System.out.println("Error: Keywords have different lengths");
                        return;
                }

                for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == str1.charAt(i)) {
                                c1++;
                        }

                }

                if (c1 == str.length()) {
                        System.out.println("No error: Keywords match at all positions");
                } else {
                        System.out.println("Error: Keywords do not match at all positions");
                }
        }
}
