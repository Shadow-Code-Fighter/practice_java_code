public class practice_code_4 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 10, 11};
        
        for (int num :arr) {
            int v = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    v++;
                }
            }
            if (v == 2) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}
