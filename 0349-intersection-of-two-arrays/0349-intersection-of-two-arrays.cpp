class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        int i = 0 ;
        int j = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();

        while(i<n1 && j<n2){
            if(nums1.at(i)<nums2.at(j)){
                i++;
            }
            else if(nums1.at(i) > nums2.at(j)){
                j++;
            }
            else{
                ans.push_back(nums1[i]);

                int val = nums1[i];

                while(i < n1 && nums1[i] == val) {
                    i++;
                }

                while(j < n2 && nums2[j] == val) {
                    j++;
                }
            }
        }
        return ans;
    }
};