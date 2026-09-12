// 🧩 Problem 8 — Average of Array

// Given:

// int[] arr = {10, 20, 30, 40, 50};

// Write a Java program to calculate and print the average of all elements.

public class array_08 {
    public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
 double sum = 0;

 for (int idx = 0; idx < arr.length; idx++) {
     sum+= arr[idx];
     
 }
 System.out.println(sum/arr.length);
    }
}
