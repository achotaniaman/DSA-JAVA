// 🧩 Problem 9 — Count Positive, Negative and Zero

// Given:
// int[] arr = {10, -5, 0, 7, -2, 0, 15, -8};
// Write a Java program to count how many elements are:
// Positive
// Negative
// Zero
public class array_09 {

    public static void main(String[] args) {
        int[] arr = {10, -5, 0, 7, -2, 0, 15, -8};
        int p = 0;
        int n = 0;
        int z = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                p++;
            }
            else if (arr[i]<0){
                n++;
            }
            else{
                z++;
            }
            
        }
        System.out.println("Count of Positive no: "+ p);
        System.out.println("Count of negative no: "+ n);
        System.out.println("Count of Zero no: "+ z);

    }
}
