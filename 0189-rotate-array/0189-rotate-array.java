class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n;
       int [] temp = new int[k+1];
       int idx = n-1;

       for(int i = 0 ; i<k ; i++){
        temp[i] = nums[idx--];
       }

       for(int i = n-1-k ; i>=0 ; i--){
        nums[i+k] = nums[i];
       }
       idx = k-1;
       for(int i = 0 ; i<k ; i++){
        nums[idx--] = temp[i];
       }
    }
}