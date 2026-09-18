// Given:

// int[] arr = {0, 1, 0, 3, 12};

// Rearrange the array so that all zeros move to the end, while keeping the relative order of non-zero elements unchanged.

public class array_15 {
    public static void main(String[] args) {
int[] arr = {0, 1, 0, 3, 12};
int pos=0;
int temp;
for (int i = 0; i < arr.length; i++) {
    if(arr[i]!=0){
        
         temp=arr[i];
         arr[i]=arr[pos];
         arr[pos]=temp;
            pos++;
        
    }
    
    
}
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
    
}
        
    }
}
