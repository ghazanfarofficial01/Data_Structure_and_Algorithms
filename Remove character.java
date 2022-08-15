class Solution{
    static String removeChars(String string1, String string2){
        // code here
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i< string2.length(); i++){
            list.add(string2.charAt(i));
        }
        
        String ans = "";
        for(int i= 0; i<string1.length(); i++){
            char ch = string1.charAt(i);
            
            if(!list.contains(ch)){
                ans += ch;
            }
            else continue;
        }
        return ans;
    }
}
