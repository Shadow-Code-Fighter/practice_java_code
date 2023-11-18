import java.util.Scanner;
import java.util.StringTokenizer;

public class Hash {
   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    String str=sc.nextLine();
    StringTokenizer st = new StringTokenizer(str);
    int count=0;

    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
        count++;
    }
    System.out.println(count);
}
}
