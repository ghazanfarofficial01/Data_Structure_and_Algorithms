class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {   
     ArrayList<String> list = new ArrayList<String>();
        String temp = "";
      //store all words in array list
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) != '.'){
                temp += S.charAt(i);
            }
            
            if(S.charAt(i) == '.' || i == S.length()-1){
                
                list.add(temp);
                temp = "";
            }
            }
        
        
        String ans = "";
      
        for(int i = list.size()-1; i>= 0; i--){
            ans += list.get(i);
            if(i !=0) ans+= '.';
            
            
        }
        return ans;
    }
    }

//another solution using .split()
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {   
      String[] str = S.split("[.]");
        
        String ans = "";
        
        for(int i = str.length-1; i>= 0; i--){
            ans += str[i];
            if(i != 0) ans += '.';
        }
        return ans;
    }
}
