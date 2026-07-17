class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int [] temp = new int[k];
        int idx = 0;

        for(int i = n-k ; i<n ; i++){
            temp [idx] = nums[i];
            idx++;
        }

        idx = n-1;
        for(int i = n-k-1 ; i>=0 ; i--){
            nums[idx] = nums[i];
            idx--;
        }

        for(int i = 0 ; i<k ; i++){
            nums[i]= temp [i];
        }


    }
}