//Approach1 - using hashmap
// Time complexity- O(N)
//Space complexity - O(N)
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        if(size == 1) return a[0];
        for(int i = 0; i<size; i++){
            if(hm.containsKey(a[i])){
                int count = hm.get(a[i]) +1;
                if(count > size/2) return a[i];
               
                else{
                  hm.put(a[i], count);
                }
            }
            
            else{
                hm.put(a[i],1);
            }
        }
        return -1;
        
    }
}

/*-------------------------------------------------------------------------------------------------------------------------------------------- */
//Approach2 - Using Moore’s Voting Algorithm
//TC - O(N)
//SC - O(1)

class Solution
{
  
    static int findCandidate(int[] a, int size){
        int count = 1; 
        int candidate = 0;
        for(int i = 1; i<size; i++){
            if(a[candidate] == a[i]) count++;
            
            else{
                count--;
                if(count == 0){
                    candidate = i;
                    count = 1;
                } 
            }
        }
        return candidate;
    }
    
    
    static Boolean isMajority(int a[],int c,int size){
        int count = 0;
        for(int i = 0; i<size; i++){
            if(a[c] == a[i]) count ++;
        }
        
        if(count > size/2) return true;
        
        else return false;
    }
    
    
    
    static int majorityElement(int a[], int size)
    {
        // your code here
        int candidate = findCandidate(a,size);
        
        if(isMajority(a,candidate,size)) return a[candidate];
        
        else return -1;
        
    }
}
