class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        long res = 0;
        Arrays.sort(arr);
        for(int i = 0; i<n-2; i++){
            
            
            int left = i+1;
            int right = n-1;
            
            while(left< right){
                
                long temp = arr[i] + arr[left] + arr[right];
                
                if(temp < sum){
                    res+= right-left;
                    left++;
                }
                
               //else if(temp >= sum) right--;
                
                else right--;;
                
                
            }
        }
        return res;
    }
}
