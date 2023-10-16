public class practice_code_sorting {
    public static void main(String[] args) {
        int array[] = { 2, 5, 3, 4, 2, 6 };
        int temp;

        System.out.println("Before Sorting");
        for (int k : array) {
            System.out.println(k);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Before Sorting");
        for (int k : array) {
            System.out.println(k);
        }
    }
}
