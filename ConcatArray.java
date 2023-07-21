package SolvedLeetCode;

class ConcatArray {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
            newNums[nums.length + i] = nums[i];
        }
        return newNums;
    }
}
