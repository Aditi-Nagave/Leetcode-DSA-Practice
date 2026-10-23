class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        vector<int> visited(nums2.size());

        for(int i = 0 ; i<nums1.size() ; i++){
            for(int j = 0 ; j< nums2.size() ; j++){
                if(nums1.at(i) == nums2.at(j) && visited.at(j) == 0 && find(ans.begin(),ans.end(),nums1.at(i)) == ans.end()){
                    ans.push_back(nums1.at(i));
                    visited.at(j) =1;
                    break;
                }
            }
        }
        return ans;
    }
};