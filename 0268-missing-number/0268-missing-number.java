class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int[] hash = new int[n+1];

        for(int i = 0 ; i<n ; i++){
            int num = nums[i];
            hash[num] = 1;
        }

        for(int i = 0 ; i<hash.length ; i++){
            if(hash[i] != 1){
                ans = i;
                break;
            }
        }
        return ans;
        
    }
}