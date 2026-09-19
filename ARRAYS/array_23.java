// Q23 — Left Rotate Array by K Places

// Given:

// int[] arr = {1, 2, 3, 4, 5, 6, 7};

// Rotate the array left by 3 positions.

public class array_23 {
     public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7};

for (int j = 0; j < 3; j++) {
    int first = arr[0];
    for (int i =1; i < arr.length; i++) {
    arr[i-1] = arr[i ];
    
}

  arr[arr.length-1]=first;
}

   for (int idx = 0; idx < arr.length; idx++) {
       System.out.println(arr[idx]);
       
   }  

    }

}