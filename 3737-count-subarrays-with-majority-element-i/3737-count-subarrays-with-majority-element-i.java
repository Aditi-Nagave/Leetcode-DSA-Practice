class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans =0;

        for(int i = 0 ; i<n ; i++){
            int ct =0;
            for(int j =i ; j< n ; j++){
                if(nums[j]  == target){
                    ct += 1;
                    }
                    int sub_length = (j-i)+1;
                    if(ct > sub_length/2){
                        ans++;
                }
            }
        }
        return ans;
    }
}