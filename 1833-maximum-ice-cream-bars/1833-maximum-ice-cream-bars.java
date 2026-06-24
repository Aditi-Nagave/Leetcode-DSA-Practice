class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int ans = 0;
        int sum =0;

        for(int i : costs){
            sum += i;
            if(sum<= coins){
                ans++;
            }else{
                break;
            }
        }
        return ans;
        
    }
}