class Solution 
{
public:
    void rotate(vector<int>& nums, int k) 
    {
        int n = nums.size();
        k = k%n;

        reverse(0, n-k-1, nums);
        reverse(n-k , n-1, nums);
        reverse(0 , n-1, nums);
    }

    void reverse(int left , int right, vector<int>&arr)
    {
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
};