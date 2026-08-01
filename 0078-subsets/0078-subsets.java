class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans , temp , nums, 0);
        return ans;
        
    }
    private void helper(List<List<Integer>> result , List<Integer> output, int[] nums, int index){
        if(index == nums.length){
            result.add(new ArrayList<>(output));
            return;
        }

        output.add(nums[index]);
        helper(result,output,nums,index+1);
        output.remove(output.size()-1);
        helper(result,output,nums,index+1);
    }


}