class Solution {
    public int numOfStrings(String[] patterns, String word) {
        boolean present = false;
        int ct =0;
        for(String str : patterns){
            present = word.contains(str);
            if(present){
                ct++;
            }
        }
        return ct;
        
    }
}