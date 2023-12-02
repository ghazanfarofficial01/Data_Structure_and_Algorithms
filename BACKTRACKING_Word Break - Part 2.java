class Solution{
    
    static List<String> result = new ArrayList<String>();
    
    static List<String> wordBreak(int n, List<String> dict, String s)
    {   result.clear();
        solve(dict,s,"");
        return result;
    }
    
    
    static void solve(List<String> dict, String s,  String ans){
        if(s.length() == 0){
            result.add(ans);
            return;
        }
        
        for(int i = 0; i<s.length(); i++){
            String left = s.substring(0,i+1);
            if(dict.contains(left)){
                String right = s.substring(i+1,s.length());
                String g = (i==s.length()-1)?"":" ";
                solve(dict,right,ans+left+g);
            }
        }
    }
}
