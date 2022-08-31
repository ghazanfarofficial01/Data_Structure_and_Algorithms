class Solution
{
   
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //first sort the array
        Arrays.sort(arr); 
      //fixt one element
        for(int i = 0; i<n-2; i++){
            int l = i+1;
            int high = n-1;
            //find other two elements using two pointer approach
            while(l<high){
                if(arr[i] + arr[l] + arr[high] == 0) return true;
                
                else if(arr[i] + arr[l] + arr[high] > 0) high--;
                
                else l++;
            }
        }
        return false;
    }
}
