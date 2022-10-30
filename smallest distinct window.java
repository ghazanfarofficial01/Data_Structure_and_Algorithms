class solution{
   public int findSubstring(String str){
         
       int n = str.length();
// if string is empty or having one char
		   if (n <= 1)
			   return 1;
     
// Count all distinct characters.
	     HashSet<Character> hs = new HashSet<>();
		      for (int i = 0; i < n; i++) {
		          hs.add(str.charAt(i));
		        }
           int dist_count = hs.size();
   
     
      int start = 0;
		  int min_len = Integer.MAX_VALUE;
		
		  int count = 0;
		  int[] curr_count = new int[256];
     
     	for (int j = 0; j < n; j++) {
       // Count occurrence of characters of string
		     	curr_count[str.charAt(j)]++;
       
       	if (curr_count[str.charAt(j)] == 1)
			    	count++;
        
        // if all the characters are matched
		    if (count == dist_count) {
            while (curr_count[str.charAt(start)] > 1) {
		    	      curr_count[str.charAt(start)]--;
				    	  start++;
		    	    }
            	int len_window = j - start + 1;
		        	if (min_len > len_window) {
					    min_len = len_window;
	            }
          }
        
      
      }
     return min_len;
   }

}
