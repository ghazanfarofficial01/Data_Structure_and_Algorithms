class Solution
{
    int maxLen(int arr[], int n)
    {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        
        for(int i = 0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                maxLen = i+1;
                continue;
            }
            
            else if(hm.containsKey(sum)){
                int temp = i - hm.get(sum);
                maxLen = Math.max(temp, maxLen);
                
            }
            else hm.put(sum,i);
        }
        return maxLen;
    }
}
