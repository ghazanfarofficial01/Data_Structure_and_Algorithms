//my solution
class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here 
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        
        for(int i = 0; i<n; i++){
            if(arr[i] == 0) count_0++;
            if(arr[i] == 1) count_1++;
            if(arr[i] == 2) count_2++;
               }
               
            for(int i = 0; i<n; i++){
                if(count_0 > 0){ 
                    count_0--;
                    arr[i] = 0; 
                 }
                 else if(count_1 > 0) {
                 count_1--;
                 arr[i] = 1;
                     }
                  else arr[i] = 2;
            }   
    }
}


//editorial solution
 int low = 0, mid = 0, high = n-1;
        
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            
            else if(arr[mid] == 1){
                mid++;
            }
            
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
