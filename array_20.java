// Q20 — Find the Missing Number

// Given an array containing distinct numbers from 0 to n, exactly one number is missing.

// int[] arr = {3, 0, 1};

// Expected output:

// Missing number = 2
// Your task

// Write the Java code to find the missing number.

// Hint: Think about the expected sum of numbers from 0 to n.

public class array_20 {
    public static void main(String[] args) {
int[] arr = {2, 0, 1,4};
double n= arr.length;
double nsum=n*(n+1)/2;
int arrsum = 0;


for (int i = 0; i < arr.length; i++) {
    
     arrsum = arrsum+arr[i];

}
double missing = nsum- arrsum;
        System.out.println("Missing term is: "+missing);
    }
}
