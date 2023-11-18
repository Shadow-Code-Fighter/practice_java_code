import java.util.*;

public class MobileValid {
    public static void main(String[] args) {
        System.out.println("Enter your mobile number: ");
        Scanner sc = new Scanner(System.in); 
        String mobNum=sc.next();
        String regex = "[6-9][\\d]{9}";

        if(mobNum.matches(regex)){
            System.out.println("input accept");
        }else{
            System.out.println("error");
        }
    }
}
