class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        int i = 0, j =1;
        Arrays.sort(arr);
        while( i < size && j < size){
            if(i != j && arr[j] - arr[i] == n){
                return true;
                
            }
            
            else if(arr[j] - arr[i] > n) i++;
            
            else j++;
        }
        return false;
    }
}
