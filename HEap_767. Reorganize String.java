// Approach: Array Sort Approach
// Objective
// In this approach, we sort the array of characters by their frequency and then place them at alternate positions in the result string. This ensures that no two adjacent characters are the same.

// Key Data Structures
// Array: Used for storing characters sorted by frequency for easy access.
// Enhanced Breakdown
// Initialization:

// Count the frequency of each character in the string.
// Sort the array of characters based on their frequency in descending order.
// Processing Each Character:

// Start placing the most frequent characters first. Place them at even indices (0, 2, 4, ...).
// Next, place the remaining characters at the odd indices (1, 3, 5, ...).
// During this process, if the most frequent character appears more than (length of string+1)/2 times, return an empty string as reorganization is not possible.
// Wrap-up:

// Combine all the individual characters to form the final reorganized string.



class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        char[] arr = s.toCharArray();

        for(char c: arr){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> q = new PriorityQueue<>(
            (a,b) -> hm.get(b) - hm.get(a)
        );
        q.addAll(hm.keySet());
        char[] result = new char[s.length()];
        int i = 0;

        if(hm.get(q.peek()) > (s.length()+1)/2) return "";

        while(!q.isEmpty()){
            char ch = q.poll();

            for(int j = 0; j<hm.get(ch); j++){
                if(i>= s.length()) i = 1;

                result[i] = ch;
                i+=2;
            }

        }

        return new String(result);

    }
}
