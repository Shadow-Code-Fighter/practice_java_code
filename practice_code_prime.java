import java.util.*;

public class practice_code_prime {
    public static void main(String[] args) {
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number To check Prime or Not");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                j++;
            }
        }
        if(j==2)
            System.out.println("Prime: "+num);
        else
            System.out.println("Not Prime: "+num);
            sc.close();
    }
    
}