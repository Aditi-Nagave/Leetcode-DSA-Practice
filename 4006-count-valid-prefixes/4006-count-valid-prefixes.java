class Solution {
    public int countValidPrefixes(String s) {
        int n = s.length();
        int ct1 = 0;
        int ct0 = 0;
        int ans = 0;

        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == '1'){
                ct1++;
            }else{
                ct0++;
            }
            
            int diff = Math.abs(ct1-ct0);
           if(i % 2 == 0){
                // odd len
                if(diff == 1){
                    ans ++;
                }
           }else{
                if(diff == 0){
                    ans++;
                }
           }
        }
        return ans;
        
    }
}