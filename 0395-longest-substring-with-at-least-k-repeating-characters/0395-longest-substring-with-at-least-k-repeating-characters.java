class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;
        int n = s.length();

        for(int i = 0; i<n ; i++ ){
            HashMap <Character , Integer> map = new HashMap<>();

            for(int j =  i ; j< n ; j++){

                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);

                boolean valid = true;
                for(int a : map.values()){
                    if(a < k ){
                        valid = false;
                        break;
                    }
                }

                if(valid){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
        
    }
}