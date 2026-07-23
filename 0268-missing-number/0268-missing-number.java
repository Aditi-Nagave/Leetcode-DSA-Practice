class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int flag = 0;
        int ans = n;
        Arrays.sort(nums);

        for(int i = 0 ; i<n ; i++){
            if(nums[i] != flag){
                ans = flag;
                break;
            }
            flag++;
        }
        return ans;
        
    }
}