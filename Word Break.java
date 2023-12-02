//backtracking
class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {     
        
        //code here
        int size = A.length();
        if(size == 0) return 1;
        
        for(int i = 1; i<= size; i++){
            if(B.contains(A.substring(0,i)) && wordBreak(A.substring(i,size),B) ==1){
                return 1;
            }
        }
        
        return 0;
    }
}



//backtracking with memoiztion

class Sol
{   
    static HashSet<String> hs = new HashSet<String>();
    
    public static int wordBreak(String A, ArrayList<String> B )
    {
        
        return solve(A,B);
    }
    
    public  static int solve(String A, ArrayList<String> B){
        //code here
        int size = A.length();
        if(size == 0) return 1;
        
        if(hs.contains(A)) return 1;
        
        for(int i = 1; i<= size; i++){
            if(B.contains(A.substring(0,i)) && solve(A.substring(i,size),B) ==1){
                hs.add(A);
                return 1;
            }
        }
        
        return 0;
    }
}
