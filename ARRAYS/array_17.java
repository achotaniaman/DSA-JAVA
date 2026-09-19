
// Remove duplicates from a sorted array

// int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};


public class array_17 {
    public static void main(String[] args) {
int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
int pos= 1;
for (int i = 1; i < arr.length; i++) {
    if(arr[i]!=arr[i-1]){
        arr[pos] = arr[i];
        pos++;
    }
    
}
for (int i = 0; i < pos; i++) {
    System.out.println(arr[i]);
}
        
    }
}
