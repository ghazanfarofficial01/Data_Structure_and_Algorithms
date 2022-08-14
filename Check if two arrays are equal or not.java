class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long,Integer> hm = new HashMap<>();
        for(long el: A){
            if(hm.containsKey(el)){
                hm.put(el,hm.get(el)+1);
            }
            
            else{
                hm.put(el,0);
            }
        }
        
        
        
        for(long el: B){
            if(!hm.containsKey(el)) return false;
            else{
                if(hm.get(el)<0)return false;
                
                else{
                    hm.put(el,hm.get(el)-1);
                }
            }
        }
        return true;
    }
}
