import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
  public static void main(String[] args) {
//     Pattern p =Pattern.compile("\\s");
//     Matcher m = p.matcher("Pankaj Sir Academy");
//     int prevEnd=0;
//     while(m.find()){
//          int start = prevEnd;
//       int end = m.start();
//       String token = "Pankaj Sir Academy".substring(start, end);
//       System.out.println(token);
//       prevEnd=m.end();
//     }
//     String lastToken = "Pankaj Sir Academy".substring(prevEnd);
//     System.out.println(lastToken);
//   }

    Pattern p = Pattern.compile("\\s");
    String input = "Pankaj Sir Academy";
    String[] tokens = p.split(input); // Split the input string by whitespace

    for (String token : tokens) {
        System.out.println(token);
    }
  }
}