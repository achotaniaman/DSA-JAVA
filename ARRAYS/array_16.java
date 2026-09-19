// 🧩 Problem 16 — Left Rotate Array by 1

// Given:

// int[] arr = {10, 20, 30, 40, 50};

// Rotate the array one position to the left.

// Expected Output

public class array_16 {
    public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
int first = arr[0];
for (int i =1; i < arr.length; i++) {
    arr[i-1] = arr[i ];
    
}
  arr[arr.length-1]=first;
   for (int idx = 0; idx < arr.length; idx++) {
       System.out.println(arr[idx]);
       
   }     
    }
    
}
