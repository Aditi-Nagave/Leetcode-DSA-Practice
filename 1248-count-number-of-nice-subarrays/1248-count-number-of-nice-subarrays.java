class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
        
    }
    public int atMost(int [] arr , int k){
        int n = arr.length;
        int l = 0;
        int r = 0;
        int ct = 0;
        int sum = 0;
        if(k<0) return 0;

        while(r<n){
            sum += arr[r]%2;

            while(sum > k){
                sum -= arr[l]%2;
                l++;
            }

            ct += r-l+1;
            r++;
        }
        return ct;
    }
}