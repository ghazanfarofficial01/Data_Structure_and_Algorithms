class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int[] arr = new int[26];
        int n = S.length();
        for(int i = 0; i<n; i++){
            int index = S.charAt(i) - 'a';
            arr[index] += 1;
        }
        
        for(int i = 0; i<n; i++){
            int index = S.charAt(i) - 'a';
            if(arr[index] == 1) return S.charAt(i);
        }
        return '$';
    }
}
