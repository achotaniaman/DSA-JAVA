// Write a Java program that calculates the sum of all elements in:

// int[] arr = {10, 25, 7, 40, 15};

    public class array_07 {
        public static void main(String[] args) {
    int[] arr = {10, 25, 7, 40, 15};
    int sum = 0;
    for (int idx = 0; idx < arr.length; idx++) {
        sum=arr[idx]+sum;
        
    }
            System.out.println(sum);
        }
    }
