class Solution {
    public int missingNumber(int[] nums) {

        int length = nums.length;
        int totalSum = length * (length + 1) / 2;

        int arraySum = 0;
        for (int num : nums) {
            arraySum+=num;
        }

        return totalSum -arraySum;

/*
       Arrays.sort(nums);
       int count = 0;
       for(int num : nums) {
        if(num != count) {
            return num - 1;
        }
        count++;
       }
       return nums[nums.length - 1] + 1;
       */
    }
}
