// 🧩 Problem 10 — Find the Second Largest Element

// Given:
// int[] arr = {10, 25, 7, 40, 15, 32};
// Write a Java program to find the second largest element in the array.
// Expected Output
// Second Largest = 32
public class array_10 {

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 15, 32};
        int max = arr[0];
        int secmax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (secmax < arr[i] && arr[i] < max) {
                secmax = arr[i];
            }

        }
        System.out.println(secmax);

    }
}
/*
LEARNING — Finding Second Largest Element

We maintain two variables:

max     → largest element seen so far
secmax  → second largest element seen so far

During one traversal:

1. If arr[i] > max:
   - The old max becomes the second largest.
   - Then arr[i] becomes the new max.

   secmax = max;
   max = arr[i];

2. Otherwise, if arr[i] is smaller than max but greater than
   secmax, it becomes the new second largest.

   secmax = arr[i];

Important:
When updating max, update secmax FIRST because we need the
old value of max.

Pattern:
        new maximum
             ↓
old max → secmax
new value → max

Time Complexity: O(n)
Space Complexity: O(1)
*/