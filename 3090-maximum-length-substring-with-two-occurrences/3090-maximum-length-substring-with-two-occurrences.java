class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int r = 0;
        int l = 0;
        int maxlen = 0;
        HashMap <Character,Integer> map = new HashMap<>();

        while(r<n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int ct = map.get(ch);
            while(map.get(ch) > 2){
                char left_char = s.charAt(l);
                int freq = map.get(left_char);
                freq--;
                if(freq == 0){
                    map.remove(left_char);
                }else{
                    map.put(left_char,freq);
                }
                l++;

            }
            if(map.get(ch) <= 2){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;

        }
        return maxlen;
        
    }
}