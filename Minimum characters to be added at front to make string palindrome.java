class Solution {
    public static int minChar(String str) {
        int start = 0;
        int end = str.length()-1;
        int trim = end;
        int ans = 0;
        
        while(start<end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            
            else{
                ans++;
                start = 0;
                end = --trim;
            }
        }
        return ans;
    }
}
