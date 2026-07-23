class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int ans = 0;
        int ct = 0;

        for(int i = 0 ; i<n ;i++){
            if(nums[i] == 1){
                ct++;
                ans = Math.max(ct,ans);
            }else{
                ct = 0;
            }
        }
        return ans;
    }
}