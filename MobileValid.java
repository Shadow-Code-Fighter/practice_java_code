import java.util.*;

public class MobileValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your mobile number: ");
        String mobNum=sc.next();
        String regex = "[6-9][0-9]{9}";

        if(mobNum.matches(regex)){
            System.out.println("input accept");
        }else{
            System.out.println("error");
        }
    }
}
