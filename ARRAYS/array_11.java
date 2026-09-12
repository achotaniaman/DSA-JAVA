// 🧩 Problem 11 — Check if Array is Sorted

// Given:

// int[] arr = {10, 20, 25, 30, 40};

// Write a Java program to check whether the array is sorted in ascending order.

// Expected Output
// Array is sorted

// If the array were:

// int[] arr = {10, 20, 15, 30, 40};

// the output should be:

// Array is not sorted

public class array_11 {
    public static void main(String[] args) {
int[] arr = {10, 20, 25, 30, 40};
boolean sorted = true;
for (int i = 1; i < arr.length; i++) {
    if(arr[i-1]<arr[i]){
        sorted=true;
    }
    else{
        sorted=false;
        break;
    }
    
}
if(sorted!=false){
    System.out.println("Sorted array");
    
}
else
{
    System.out.println("Unsorted array");
}
        
    }
}
