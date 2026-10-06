class Solution 
{
public:
    int removeDuplicates(vector<int>& nums) 
    {
        set<int> numbers;

        for(int i = 0 ; i<nums.size() ; i++)
        {
            numbers.insert(nums[i]);
        }

        int index = 0;
        int ct = 0;
        for(int num : numbers)
        {
            nums[index]=num;
            index++;
            ct++;
        }
        return ct;
    }
};