class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        if(str.length() <26) return false;
        String new_str = str.toLowerCase();
        int[] hash = new int[26];
        
        for(int i = 0; i<str.length(); i++){
            if(new_str.charAt(i) <=122 && new_str.charAt(i)>=97){
            int index = new_str.charAt(i) - 'a';
            hash[index] += 1;
            }
        }
        
        for(int i = 0; i<26; i++){
            if(hash[i] < 1) return false;
        }
        return true;
    }
}
