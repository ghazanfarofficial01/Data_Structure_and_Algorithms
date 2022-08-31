class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
    
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        
        int i = low-1;
        
        for(int j = low; j<high; j++){
            
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1,high);
        return i+1;
    } 
}
