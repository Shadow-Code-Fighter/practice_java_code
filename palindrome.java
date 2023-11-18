import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // String rev="";

        // for(int i=s.length()-1;i>=0;i--){
        //     rev=rev+s.charAt(i);
        // }
        // if(s.equals(rev)){
        //     System.out.println("pelidrom");
        // }
        // else{
        //     System.out.println("not pelidrome");
        // }

        // StringBuffer bf = new StringBuffer("121");
        // // bf.reverse();
        // if (bf.reverse().toString().equals("121")) {
        //     System.out.println("peli");
        // } else {
        //     System.out.println("not peli");
        // }
        
        // int s=0,r;
        // System.out.println("Enter a number: ");
        // int n=sc.nextInt();
        // int c=n;


        // while(n>0){
        //     r=n%10;
        //     s=(s*10)+r;
        //     n=n/10;

        // }
        // if(c==s){
        //     System.out.println("p");
        // }else{
        //     System.out.println("not peli");
        // }

        String s ="gaurav";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
            if(s.equals(rev)){
                System.out.println("palidrome");
            }else{
                System.out.println("NOt palidrome");
        }

    }
}
