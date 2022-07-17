class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int[] hash = new int[26];
        
        for(int i = 0; i<a.length();i++){
            int index = a.charAt(i) - 'a';
            hash[index] += 1;
        }
        
        for(int i = 0; i<b.length(); i++){
            int index = b.charAt(i) - 'a';
            
            if(hash[index] < 1) return false;
            else{
                hash[index] -= 1;
            }
        }
        return true;
    }
}
