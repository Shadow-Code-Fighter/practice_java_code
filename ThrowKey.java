import java.util.Scanner;

public class ThrowKey {
    public static void main(String[] args) {
        int balance = 500;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = sc.nextInt();

        if(balance > amount ) {
            System.out.println("Please Collect Cash: " + amount);
        }
        else {
            try{
                throw new InsufficientFunds();
            }catch(InsufficientFunds e ) {
                e.printStackTrace();
                System.out.println("Low Balance !!!");
            }
        }
    }
}
