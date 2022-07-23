class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       //length of s
       int n1 = s.length();
       //length of x
       int n2 = x.length();
       int i = 0;
       
       while(i < n1){
           // enter in inner loop only when char at i and char at j matches
           if(s.charAt(i)== x.charAt(0)){
               int j = 0;
               int k = i;
               
               while(k<n1 && j<n2){
                   
                   if(s.charAt(k)== x.charAt(j)){
                       //if both the chars are same and it is the last char of string x,the we have found the first 
                       //occurance of string x.Return index i;
                       if(j == n2-1){
                           return i;
                       }
                       
                       else{
                           j++;
                           k++;
                       }
                   }
                   //break if there chars at k and j are not same
                   else{
                       break;
                   }
               }
           }
           //increment i
           i++;
       }
       return -1;
    }
}
