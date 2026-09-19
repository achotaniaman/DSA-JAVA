// Q22 — Maximum Consecutive 1s

// Given a binary array containing only 0 and 1:

// int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};

// Find the maximum number of consecutive 1s.

// Expected output:

// Maximum consecutive 1s = 3

public class array_22 {
    public static void main(String[] args) {
int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
int currentstreak=0;
int maxstreak=0;
for (int i = 0; i < arr.length; i++) {
    if(arr[i]==1){
        currentstreak++;
        

    }
    else {
    currentstreak = 0;
}
    if(currentstreak>maxstreak){
        maxstreak=currentstreak;
    }
    
}
System.out.println(maxstreak);
        
    }
}
