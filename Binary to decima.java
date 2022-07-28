class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        String num = str;
        int base = 1;
        int result = 0;
        
        int n = str.length();
        
        for(int i = n-1; i>=0; i--){
            if(num.charAt(i) == '1'){
                result += base;
            }
            base = base*2;
        }
        return result;
    }
}
