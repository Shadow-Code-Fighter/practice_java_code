public class practice_code_2 {
    public static void main(String[] args) {
        int array[] = {2,6,2,4,4,5,1,3};
        int temp;
System.out.println("unsorted");
        for(int k:array){
            System.out.println(k);
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("sorted");
        for(int k:array){
            System.out.println(k);
        }
    }
}
