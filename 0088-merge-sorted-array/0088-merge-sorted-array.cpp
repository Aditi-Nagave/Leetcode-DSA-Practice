class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
       int i = m-1;
       int j = n-1;
       int k = n+m-1;

       while(i>=0 && j>=0){
        if(nums2.at(j) >= nums1.at(i)){
            nums1.at(k) = nums2.at(j);
            j--;
        }else{
            nums1.at(k) = nums1.at(i);
            i--;
        }
        k--;
       }

       while(j >= 0){
        nums1.at(k) = nums2.at(j);
        j--;
        k--;
       }
    }
};