class Solution {
    
         static String swap(String a, int i, int j){
             char temp;
             char[] charArray = a.toCharArray();
             temp = charArray[i];
             charArray[i] = charArray[j];
             charArray[j] = temp;
             return String.valueOf(charArray);
         }
        static void find_permutation(List<String> list,String S, int l , int r){
            
             if(l == r){
                 list.add(S);
                 return;
             }
             
             for(int i = l; i<=r; i++){
                 S = swap(S,l,i);
                 find_permutation(list,S,l+1,r);
                 swap(S,l,i);
             
             }
            
        }
      
    public List<String> find_permutation(String S) {
        // Code herereturn 
         int l = 0, r = S.length()-1;
          List<String> list = new ArrayList<String>();
           find_permutation(list,S,l,r);
           Collections.sort(list);
             return list;

    }
}
