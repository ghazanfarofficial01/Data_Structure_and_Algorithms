class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        int[] arr = new int[27];
        
        for(int i = 0; i< s.length(); i++){
            int index = Integer.valueOf(s.charAt(i)) - 96;
            if(arr[index] > 0) return Character.toString(s.charAt(i));
            
            else arr[index] = 1;
        }
        return "-1";
    }
} 
