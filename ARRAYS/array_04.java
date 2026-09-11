// int[] arr = {12, 7, 4, 19, 22, 31, 8, 5};

// Write a program to count how many even numbers are present in the array.
public class array_04 {

    public static void main(String[] args) {
        int[] arr = {12, 7, 4, 19, 22, 31, 8, 5};
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }

        }
        System.out.println(even);
    }
}
