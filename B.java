import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1=str.toString();
        int count = 0;
        Pattern p = Pattern.compile("[a-zA-Z^6-9]");
        Matcher m = p.matcher(str1);
        while (m.find()) {
            count++;
        }
        if (count != 0 ) {
            System.out.println("Error input");
        } else {
            System.out.println("Input accepted");
        }
    }
}
