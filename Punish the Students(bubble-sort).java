class Solution
{   
    public static int countSwaps(int[] arr, int n){
        int swaps = 0;
         
         for(int i = 0; i<n-1; i++){
             boolean flag = false;
             for(int j = 0; j<n-i-1; j++){
                 if(arr[j] > arr[j+1]){
                     int temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;
                     swaps++;
                     flag = true;
                 }
             }
             if(flag == false) break;
         }
         return swaps;
    } 
    
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int swaps = countSwaps(roll, n);
        swaps *= 2;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += marks[i];
        }
        
        if((sum-swaps)/n >= avg) return 1;
        else return 0;
}
}
