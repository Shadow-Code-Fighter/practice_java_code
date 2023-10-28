import java.util.Scanner;

public class intTobinary {
    public static void main(String[] args) {
        int num,quotient,i=1,j;
        int bin_num[]=new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to check binary number");
        num=sc.nextInt();

        quotient=num;

        while(quotient != 0){
            bin_num[i++]=quotient%2;
            quotient=quotient/2;
            System.out.println(quotient);
        }
        System.out.println("Binary number is: ");
        for(j=i-1;j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.println();
    }
}