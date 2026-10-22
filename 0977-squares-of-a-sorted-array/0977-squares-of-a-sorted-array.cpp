class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        int left = 0;
        int right = n-1;
        int index = n-1;
        vector<int> ans(n);
        while(left <= right){
            int leftSquare = nums.at(left) * nums.at(left);
            int rightSquare = nums.at(right) * nums.at(right);

            if(leftSquare >= rightSquare){
                ans.at(index) = leftSquare;
                left++;
            }else{
                ans.at(index) = rightSquare;
                right--;
            }
            index--;
        }
        return ans;
    }
};