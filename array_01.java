// Problem Statement

// Write a Java program that creates an integer array containing:
// 10, 25, 7, 40, 15
// Your program should:
// Store these values in an integer array.
// Traverse the array using a for loop.
// Print every element on a separate line.
// Print the length of the array.
// Print the first element.
// Print the last element.
public class array_01 {

    public static void main(String[] args) {
        int[] num = {10, 25, 7, 40, 15};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println(num.length);
        System.out.println(num[0]);
        System.out.println(num[num.length - 1]);

    }

}
