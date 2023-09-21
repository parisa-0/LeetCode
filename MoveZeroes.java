class Solution {
    public void moveZeroes(int[] nums) {

        //understanding 2 pointer problems

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        //[0,1,0,3,12]
        //nums[0] == 0 so nothing happens, pointer is 0
        //nums[1] == 1 so nums[0] = nums[1] and pointer becomes 1
        //[1,1,0,3,12] 
        //nums[2] == 0 so nothing happens, pointer is 1
        //nums[3] == 3 so nums[1] == nums[3] and pointer becomes 2
        //[1,3,0,3,12]
        //nums[4] == 12 so nums[2] == nums[4], pointer becomes 3
        //nums array is now [1,3,12,3,12]

        while (pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }

    }
} 
