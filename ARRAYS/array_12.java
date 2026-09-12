// 🧩 Problem 12 — Difference Between Largest & Smallest

// Given:

// int[] arr = {10, 5, 20, 8, 15};

// Find the difference between the largest and smallest element.

// Expected:

// Difference = 15

public class array_12 {
    public static void main(String[] args) {
int[] arr = {10, 5, 20, 8, 15};
int max = arr[0];
int min =arr[0];
for (int i = 0; i < arr.length; i++) {
    if (arr[i]>max){
        max= arr[i];
    }
    else if(arr[i]<min){
        min=arr[i];
    }
    
}
System.out.println(max-min);
        
    }
}
