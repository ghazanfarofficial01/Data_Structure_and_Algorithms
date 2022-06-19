class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {    
        ArrayList<Integer> list = new ArrayList<>();
        // Your code here
        int sum=0;
        int start=0;
        
       for(int i=0;i<n;i++){
           sum+=arr[i];
           while(sum>s){
               sum-=arr[start++];
           }
           
           if(sum==s){
                list.add(start+1);
                list.add(i+1);
                return list;
           } 
       }
       
       list.add(-1);
       return list;
    }
}
