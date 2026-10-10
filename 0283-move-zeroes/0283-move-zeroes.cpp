class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        int first_zero = -1;

        for(int i = 0 ; i<n ; i++){
            if(nums[i] == 0){
                first_zero = i;
                break;
            }
        }

        if(first_zero == -1){
            return;
        }

        for(int i = first_zero+1 ; i<n ; i++){
            if(nums[i] != 0){
                swap(nums, i , first_zero);
                first_zero += 1;
            }
        }
    }

    void swap(vector<int>& arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
};