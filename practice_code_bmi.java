import java.util.Scanner;

public class practice_code_bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight in kg: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your Height in meters: ");
        double height = sc.nextDouble();

        double BMI = weight/(height*height);
        System.out.println("The Body Mass Index is "+BMI+"kg/m2");
    }
}
