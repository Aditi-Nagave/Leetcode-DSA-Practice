class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        vector<int> arr;

        for(int i = 0 ; i<n ; i++){
            if(nums[i] != 0){
                arr.push_back(nums[i]);
            }
        }

        for(int i = 0 ; i<n ; i++){
            if(i<arr.size()){
                nums[i] = arr[i];
            }else{
                nums[i] = 0;
            }
        }
    }
};