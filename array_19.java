// int[] arr = {2, 7, 11, 15};
// int target = 9;

// Find two different elements whose sum equals target.

// Expected Output
// 2 + 7 = 9
// Rules
// Use two loops.
// Don't use HashMap yet.
// Don't use the same element twice.
// Print the two numbers that make the target.

public class array_19 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
int target = 9;

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < i; j++) {
        if(arr[i]+arr[j]==target){
            System.out.println(arr[i]+" + "+arr[j]+" = "+target);
        }
        
    }
    
}
    }
}
