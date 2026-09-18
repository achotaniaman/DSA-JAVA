// 🧩 Problem 14 — Find the Second Smallest Element

// Given:

// int[] arr = {12, 5, 8, 1, 20, 3};

// Find the second smallest element.

public class array_14 {
    public static void main(String[] args) {
        
    
int[] arr = {12, 5, 8, 1, 20, 3};
int min=arr[0];
int secmin = arr[0];
for (int i = 0; i < arr.length; i++) {
    if(arr[i]<min){
        secmin=min;
        min=arr[i];
    }
    else if(min<arr[i] && arr[i]<secmin){
        secmin=arr[i];
    }
    
}
System.out.println(secmin);

    }
    
}
