class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right =1;

        for(int i = right ; i< nums.length ; i++){
            if(nums[left] != nums[i]){
                left++;
                nums[left] = nums[i];
            }
        }
        return left+1;
        
    }
}