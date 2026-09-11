// Given:

// int[] arr = {10, 25, 7, 40, 15, 32};
// Take a number from the user as target.
// Your program should search for that number in the array.
// If it exists, print:
// Element found at index: X
// If it doesn't exist:
// Element not found

import java.util.Scanner;

public class array_05 {

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 15, 32};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from the given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }
        int choice = sc.nextInt();
        boolean found = false;
        

        for (int i = 0; i < arr.length; i++) {
            
                if (choice == arr[i]) {
                System.out.println("Element found at " + i + " index");
                found= true;
                

            
            }
            
            
            
        }
        if (!found) {
    System.out.println("Element not found");
}
        

    }
}
