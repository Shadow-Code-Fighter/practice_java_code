import java.util.Arrays;
import java.util.Scanner;

public class practice_binary_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int num = sc.nextInt();
        int[] array = new int[num];

        System.out.println("Enter elements of the array (sorted in ascending order): ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array); // Ensure the array is sorted in case it wasn't initially.

        System.out.println("Enter the search element number: ");
        int searchNum = sc.nextInt();

        int result = binarySearch(array, searchNum);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println(searchNum + " Element is found at Location " + (result + 1));
        }
    }

    public static int binarySearch(int[] array, int searchNum) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int middle = first + (last - first) / 2;

            if (array[middle] == searchNum) {
                return middle;
            } else if (array[middle] < searchNum) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        return -1; // Element not found
    }
}
