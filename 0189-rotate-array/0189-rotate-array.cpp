class Solution 
{
public:
    void rotate(vector<int>& nums, int k) 
    {
        int n = nums.size();
        k = k%n;
        int ind = 0;

        vector<int> extra(k);

        for(int i = n-k ; i<n ; i++)
        {
            extra[ind] = nums[i];
            ind++;
        }

        ind = n-1;
        for(int i = n-k-1 ; i>=0 ; i--)
        {
            nums[ind] = nums[i];
            ind--;
        }

        for(int i = 0 ; i<k ; i++)
        {
            nums[i] = extra[i];
        }
    }
};