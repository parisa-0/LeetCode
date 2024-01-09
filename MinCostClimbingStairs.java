class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCostDp = new int[cost.length];

        for(int i = 0; i < cost.length; i++) {
            if(i < 2) {
                minCostDp[i] = cost[i];
            }
            else {
            minCostDp[i] = cost[i] + Math.min(minCostDp[i - 1], minCostDp[i - 2]);
            }
        }
       return Math.min(minCostDp[cost.length-1], minCostDp[cost.length-2]);
    }
}
