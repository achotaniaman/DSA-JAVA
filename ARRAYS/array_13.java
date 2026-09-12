import java.util.*;
// Frequency of a Target Element

// Given:

// int[] arr = {2, 5, 2, 8, 2, 9, 5, 2};

// Take a number from the user and count how many times it appears in the array.
public class array_13 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 9, 5, 2};

int count = 0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the no whose freq u wanna find in array: ");
int choice = sc.nextInt();
for (int i = 0; i < arr.length; i++) {
    if(choice==arr[i]){
        count++;
    }
    
}
System.out.printf("Your choice %d is %d times in array",choice,count);
    }




    
}
