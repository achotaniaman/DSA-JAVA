// Write a Java program that takes the following array:

// int[] arr = {10, 20, 30, 40, 50};

// and prints all the elements in reverse order.

public class array_06 {
    public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};

for (int i = arr.length-1; i >=0; i--) {
    System.out.println(arr[i]);
}
        
    }
}
