// Problem 3 — Find the Minimum

// Now we're going to make you use the exact same idea, but don't blindly copy Problem 2.

// Given:

// int[] arr = {32, 15, 7, 48, 21, 5, 19};

// Write a Java program to find the smallest element in the array.

// Expected output:

// Smallest element: 5
// Rules
// Don't use Arrays.sort()
// Don't use a built-in minimum function
// Use a loop
// Try to figure out the logic yourself

public class array_03 {
    public static void main(String[] args) {
        
    
    int [] arr = {32,15,7,48,21,5,19};
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min){
            min = arr[i];
        }
        
    }
    System.out.println(min);
    }   
}
