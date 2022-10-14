class Solution{
    
    static String [] convert(int a,int b,int c, String d)
    {
        // code here
        String[] ans = new String[4];
        ans[0] = d_to_b(a);
        ans[1] = b_to_d(b);
        ans[2] = dec_to_hex(c);
        ans[3] = hex_to_dec(d);
        
        return ans;
    }
    
    static String d_to_b(int num){
        int temp = num;
        StringBuilder s = new StringBuilder();
        while(temp > 0){
            int rem = temp % 2;
            s.append(Integer.toString(rem));
            temp /= 2;
        }
        s.reverse();
        return s.toString();
    }
    
    static String b_to_d(int num){
        int temp = num;
        int p = 1;
        String s = "";
        int dec = 0;
        while(temp > 0){
            int rem = temp % 10;
            dec +=  rem * p;
            p *= 2;
            temp /= 10;
        }
        
        s += Integer.toString(dec);
        return s;
    }
    
    static String dec_to_hex(int num){
        int temp = num;
          StringBuilder s = new StringBuilder();
        while(temp > 0){
            int rem = temp % 16;
            if(rem > 9){
             s.append((char)(rem+55));
            }
            else  s.append(Integer.toString((rem)));
            temp /= 16;
        }
        s.reverse();
        return s.toString();
    }
    
    static String hex_to_dec(String num){
        int p = 1;
        int t = 0;
        String s = "";
        for(int i = num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            
            if(ch>='A'&& ch<='F'){
                t += p* (ch-55);
                 }
            
            else{
                t += p * (ch-48);
            }
            
         
            p *= 16;
            
            
        }
           s += Integer.toString(t);
        return s;
    }
    
}
