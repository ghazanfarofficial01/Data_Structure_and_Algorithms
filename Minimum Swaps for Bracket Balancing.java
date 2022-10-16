class Solution{
    static int minimumNumberOfSwaps(String S){
        // code here
        int open = 0, close = 0, swaps = 0, unbalanced = 0;
        
        for(int i = 0; i< S.length(); i++){
            
            if(S.charAt(i) == '['){
                open++;
                
                if(unbalanced > 0){
                    swaps += unbalanced;
                    unbalanced--;
                }
            }
            
            else{
                close++;
                unbalanced = close - open;
            }
        }
        return swaps;
    }
}
