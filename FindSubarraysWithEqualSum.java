class Solution {
    public boolean findSubarrays(int[] nums) {

        Set<Integer> sumOfPairs = new HashSet<>();

        for(int i = 0; i < nums.length - 1; i++) {
                if(!sumOfPairs.contains(nums[i] + nums[i+1])){
                    sumOfPairs.add(nums[i] + nums[i+1]);
                } 
                else if(sumOfPairs.contains(nums[i] + nums[i+1])) {
                    return true;
                }
            }
        return false;
    }
}
