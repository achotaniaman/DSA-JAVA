// Problem 2 — Find the Maximum

// Given:
// int[] num = {10, 25, 7, 40, 15};
// Write a program to find and print the largest element in the array.
public class array_02 {

    public static void main(String[] args) {
        System.out.println("Practice 2");
        int[] arr = {10, 25, 7, 40, 15};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println(max);

    }
}
