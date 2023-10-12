import java.util.Scanner;

public class practice_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int j=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                j++;
            }
        }
        if(j==2)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }
}
