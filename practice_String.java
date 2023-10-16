import java.util.Scanner;

public class practice_String {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,5};
        int temp[] = new int[arr.length];
        int j=0;

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        for(int k:temp)
        System.out.println(k);
    }
    
}
