import java.util.Arrays;
import java.util.Scanner;

public class practiice {
    // int balance=0;
    public static void main(String[] args) {

        // StringBuffer sb = new StringBuffer("Hello");
        // sb.append("gaurav");
        // sb.insert(0,"kumar");
        // System.out.println(sb);


        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter a number of element");
        // String str = sc.nextLine();
        // int c1=0,c2=0;

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='('){
        //         c1++;
        //     }else{
        //           if(str.charAt(i)==')'){
        //             c2++;
        //           }
        //         c1++;
        //     }
        // }
        // if(c1==c2){
        //     System.out.println("no error");

        // }
        // System.out.println("error");
// Input array from the user
        // int i;
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter a number of element");
        // int num=sc.nextInt();
        // int[] array = new int[num];
        // System.out.println("Your array size is: " + num);

        // for(i=0;i<num;i++)
        // array[i]=sc.nextInt();
        // System.out.println("Given array is: ");
        // for(int k:array){
        //     System.out.println(k);
        // }

        // System.out.println("sorting array is: ");

        // for(i = 0;i<array.length-1;i++){
        //     for(int j=0;j<array.length-1;j++){
        //         if(array[j]>array[j+1]){
        //             temp=array[j];
        //             array[j]=array[j+1];
        //             array[j+1]=temp;
        //         }
        //     }
        // }
        // for(int k:array){
        //     System.out.println(k);
        // }
    
// Linear Search
        // System.out.println("Enter a number to search value: ");
        // int searchval = sc.nextInt();

        // for(i=0;i<num;i++){
        //     if(array[i]==searchval){
        //         System.out.println(searchval+" is present at location "+(i+1));
        //         break;
        //     }
        // }
        // if(i==num)
        // System.out.println(searchval+ "not present");


    // Addition 2D MATRIX
        // int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] c = new int[3][3];

        // if (a.length == b.length && a[0].length == b[0].length) {
        //     for (int i = 0; i < a.length; i++) {
        //         for (int j = 0; j < a[i].length; j++) {
        //             c[i][j] = a[i][j] + b[i][j];
        //         }
        //     }
        // } else {
        //     System.out.println("The 'a' and 'b' Matrix are not same");
        //     return;
        // }
        // System.out.println("The Matrix 'A' Value:");
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("The Matrix 'B' Value:");
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.print(b[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("The Addition Matrix of 'A' and 'B' Value:");
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.print(c[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // String str ="dm";
        // String str1 = "c";
        // System.out.println(str1.compareTo(str));

        // int [] arr = {2,5,4,1,1,1,3,5,6,8,7};
        // int temp[]=new int[arr.length];
        // int j=0;
        // for(int k:arr){
        // System.out.println("before");
        // System.out.println(k);
        // }
        // for(int k=0;k<arr.length-1;k++){
        // if(arr[k]!=arr[k+1]){
        // temp[j] = arr[k];
        // j++;
        // }
        // }
        // System.out.println("after");
        // temp[j]=arr[arr.length-1];
        // for(int k:temp){
        // System.out.println(k);
        // }

        // String str="gaurav kumar sharma";
        // System.out.println(str.trim().split(" ").length);
        // for(int i=str.length()-1;i>=0;i--){
        // System.out.print(str.charAt(i));
        // }

        // practiice p = new practiice();
        // System.out.println(p.getState());
        // p.start();

        // try{
        // Thread.sleep(2000);
        // }catch(InterruptedException e ){
        // e.printStackTrace();
        // }
        // System.out.println(p.getState());
        // }
        // public void run(){
        // System.out.println("test");
        // notify();}

        // int arr[]={2,5,4,7,9,8,1};
        // int min=arr[0];
        // // int index=0;
        // String str= sc.next();
        // for(int i = 0;i<str.length();i++){
        // if(min>arr[i]){
        // min=arr[i];
        // index=i;
        // }
        // }
        // System.out.println(index);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Left and Right Parathesis: ");
        // String str = sc.next();
        // int count2=0; int count1=0;

        // for(int i=0;i<str.length();i++){
        // if(str.charAt(i)=='('){

        // count1++;
        // }
        // if(str.charAt(i)==')'){
        // count2++;
        // }
        // }
        // if(count1==count2){
        // System.out.println("no error");
        // }
        // System.out.println("error");

        // practiice p = new practiice();
        // p.account();
        // System.out.println(p.balance);
        // }
        // private void account() {
        // Thread t1 = new Thread(new Runnable() {
        // @Override
        // public void run(){
        // add();
        // }
        // });
        // Thread t2 = new Thread(new Runnable() {
        // @Override
        // public void run(){
        // sub();
        // }
        // });
        // t1.start();
        // t2.start();

        // try{
        // t1.join();
        // t2.join();

        // }catch(Exception e){
        // e.printStackTrace();
        // }
        // }
        // private synchronized void add() {
        // for(int i=0;i<10000;i++){
        // balance=balance+i;
        // }
        // }
        // private synchronized void sub() {
        // for(int i=0;i<10000;i++){
        // balance=balance-i;
        // }


    // Binary Search
        // int num,first,last,middle,array[],searchNum;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter size of array: ");
        //     num = sc.nextInt();
        //     array = new int[num];

        //     System.out.println("Enter element of array: ");
        //     for(int i = 0; i<num;i++){
        //         array[i]=sc.nextInt();
        //     }

        //     System.out.println("Enter search element  number: ");
        //     searchNum = sc.nextInt();
        //     first=0;
        //     last=num-1;
        //     middle = (first+last)/2;

        //     while(first<=last){
        //         if(array[middle]<searchNum)
        //         first=middle+1;

        //         else if(array[middle]==searchNum){
        //             System.out.println(searchNum+" Element is found"+" Loaction "+ (middle+1));
        //             break;
        //         }
        //             else{
        //                 last=middle-1;
        //             }
        //             middle=(first+last)/2;

        //     }
        //     if(first>last){
        //         System.out.println("not found element");
        //     }

    }
}
