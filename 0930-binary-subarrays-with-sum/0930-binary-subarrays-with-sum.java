class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)- atMost(nums,goal-1);
        
    }
    public int atMost(int [] arr, int goal){
        int n = arr.length;
        int r = 0 ;
        int l = 0;
        if(goal < 0) return 0;

        int ct = 0;
        int sum = 0;

        while(r<n){
            sum += arr[r];

            while(sum > goal){
                sum -= arr[l];
                l++;
            }

            ct += r-l+1;
            r++;
        }
        return ct;
    }
}