class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
         String result = "";
         //
         String first = arr[0];
         
         boolean flag = false;
         //loop over all characters of String first and check it is present in other 
         //string at sam e position or not
         for(int i = 0; i<first.length(); i++){
             
             //taking each string at a time
             for(int j = 1; j<n; j++){
                 
                 //if length of first string is grater than any tring in the array break 
                 //from both loop
                 if(i>=arr[j].length()) flag = true;
                 
                 else if(first.charAt(i) == arr[j].charAt(i)) continue;
                 //if character are not matching
                 else flag = true;
             }
             if(flag) break;
             result += first.charAt(i);
         }
         
         if(result.length() == 0) return "-1";
         else return result;
    }
}
