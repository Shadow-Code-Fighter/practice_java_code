import java.util.Scanner;

public class practice_code_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();

        for(int i=1;i<=10;i++){
            int result = N*i;
            System.out.println(N+"x"+i+"="+result);
        }
    
    }
}
