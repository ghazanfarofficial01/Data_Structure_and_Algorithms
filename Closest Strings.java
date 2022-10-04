class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int start = -1,end = -1;
        int ans = Integer.MAX_VALUE;
        
        int n = s.size();
        
        for(int i = 0; i<n; i++){
            if(s.get(i).equals(word1)){
                start = i;
            }
            
            if(s.get(i).equals(word2)){
                end = i;
            }
            
            if(start != -1 && end != -1){
                ans = Math.min(ans, Math.abs(end-start));
            }
            
        }
        return ans;
    }
};
