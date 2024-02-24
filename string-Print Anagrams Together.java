class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        
        int n = string_list.length;
        
        for(int i = 0; i<n;i++){
          
            char[] word_tmp = string_list[i].toCharArray();
            Arrays.sort(word_tmp);
            String word = new String(word_tmp);
            if(hm.containsKey(word)){
                hm.get(word).add(string_list[i]);
            }
            
            else{
                hm.put(word,new ArrayList<String>(Arrays.asList(string_list[i])));
            }
            
        }
        
        List<List<String>> list = new ArrayList<>();
        
        for (Map.Entry<String,ArrayList<String>> entry : hm.entrySet()){
            list.add(entry.getValue());
        }
        
        return list;
    }
}
