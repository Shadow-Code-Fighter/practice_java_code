import java.util.Scanner;

public class practice_code_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number to check odd number");
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Odd");
        }
        System.out.println("Even");
    }
}

