import java.util.*;

public class practice_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Keyword: ");
        String str=sc.nextLine();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print((char)str.charAt(i));
        }
    }
}
