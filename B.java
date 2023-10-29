import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        Pattern p = Pattern.compile("[^a-zA-Z]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        if (count != 0 || str.length() < 5) {
            System.out.println("Error input");
        } else {
            System.out.println("Input accepted");
        }
    }
}
