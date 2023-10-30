import java.util.Arrays;
import java.util.Scanner;

public class SwapNum {
    public static void swap(int [] a1, int [] a2){
        if(a1.length != a2.length){
            System.out.println("no same length");
            return;
        }
        for(int i =0;i<a1.length;i++){
        int temp = a1[i];
        a1[i]=a2[i];
        a2[i]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1[]={1,2,3};
        int num2[]={4,5,6};
        
        swap(num1,num2);

        System.out.println("a"+Arrays.toString(num1));
        System.out.println("b"+Arrays.toString(num2));
		

    }
}
