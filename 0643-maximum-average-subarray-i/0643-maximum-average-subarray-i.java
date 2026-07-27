class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double avg = 0;

        int sum = 0;

        for(int i = 0 ; i<k ; i++){
            sum += nums[i];
        }

        avg = (double)sum / k;
        int l = 0;
        int r = k-1;

        while(r<n-1){
            sum -= nums[l];
            l++;
            r++;
            sum += nums[r];
            avg = Math.max(avg,(double)sum/k);

        }
        return avg;
        
    }
}