class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int wct = 0;
        for(int i = 0 ; i<k ; i++){
            if(blocks.charAt(i) == 'W'){
                wct++;
            }
        }

        int ans = wct;
        int r = k-1;
        int l = 0 ;

        while(r<n-1){
            if(blocks.charAt(l) == 'W'){
                wct--;
            }
            l++;
            r++;
            if(blocks.charAt(r) == 'W'){
                wct++;
            }
            ans = Math.min(wct,ans);
        }
        return ans;
        
    }
}