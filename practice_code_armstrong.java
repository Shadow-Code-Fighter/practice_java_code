import java.util.*;
public class practice_code_armstrong {
    public static void main(String[] args) {
        int arg,sum=0,r;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check armstrong number");
        int num=sc.nextInt();
        arg=num;

        for(int i = 1;i<num;i++){
            while(num>0){
                r=num%10;
                sum=sum+(r*r*r);
                num=num/10;
            }
        }
        if(arg==sum){
            System.out.println("Armstrong");
        }else{
        System.out.println("Not Armstrong");
        }
    }
}
