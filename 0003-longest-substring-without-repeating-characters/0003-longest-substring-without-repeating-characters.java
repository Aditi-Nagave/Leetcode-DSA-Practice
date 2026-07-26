class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int n = s.length();

        int r = 0;
        int l = 0;
        HashSet <Character> set = new HashSet<>();

        while(r<n){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            int len = r-l+1;
            maxlen = Math.max(len, maxlen);
            r++;
        }
        return maxlen;
        
    }
}