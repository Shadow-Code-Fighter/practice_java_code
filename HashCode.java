import java.util.Scanner;

public class HashCode {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Name: ");
        // String name=sc.next();
        // StringBuffer bf = new StringBuffer(name);
        // System.out.println(bf.reverse());

        int a[] = {2,2,3,3,4,4};
        int temp[]=new int[a.length];
        int j=0;

        for(int i= 0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for(int k:temp){
            System.out.println(k);
        }
    }
}