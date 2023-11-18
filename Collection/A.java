package Collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        // ArrayList<Integer> x = new ArrayList<>();
        // x.add(20);
        // x.add(30); 
        // ArrayList<Integer> y = new ArrayList<>();
        // y.add(40);
        // y.add(50);

        // x.addAll(0, y);
        // System.out.println(x);
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your  name: ");
    String name = sc.nextLine();
    int count= 0;
    Pattern p = Pattern.compile("[^a-zA-Z]");
    Matcher m = p.matcher(name);
    while(m.find()){
        count++;
    }
    if(count!=0 || name.length()<4){
        System.out.println("Error");
    }else{
        System.out.println("not Error");
    }

    }
}
