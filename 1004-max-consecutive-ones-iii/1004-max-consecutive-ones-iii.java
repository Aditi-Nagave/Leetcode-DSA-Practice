class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int ans = 0;
        int l = 0;
        int r = 0;
        int zeros = 0;

        while(r<n){
            if (nums[r] == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
            if(zeros <= k){
                int len = r-l+1;
                ans = Math.max(len,ans);
            }
            r++;
        }
        return ans;
    }
}