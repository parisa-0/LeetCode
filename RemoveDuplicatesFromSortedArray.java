class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        nums[pointer++] = nums[nums.length - 1];
        return pointer;
    }
}
