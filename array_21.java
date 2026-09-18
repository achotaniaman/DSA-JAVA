// Q21 — Leaders in an Array 🧠

// Given:

// int[] arr = {16, 17, 4, 3, 5, 2};

// An element is a leader if all elements to its right are smaller than it.

public class array_21 {
    public static void main(String[] args) {
int[] arr = {16, 17, 4, 3, 5, 2};
int max= arr[arr.length-1];
for (int i = arr.length-1; i >=0; i--) {
    if(arr[i]>=max){
        max=arr[i];
        System.out.println(max);
    }
    
}        
    }
}
