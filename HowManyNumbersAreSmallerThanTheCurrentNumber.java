class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] resultArray = Arrays.copyOf(nums, nums.length);

        Arrays.sort(nums);
        List<Integer> myList = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            myList.add(nums[i]);
        }

        for (int j = 0; j < resultArray.length; j++) {
            resultArray[j] = myList.indexOf(resultArray[j]);
        }
        return resultArray;
    }
}
