class Solution {
    public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }


     for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j]) && j != map.get(nums[j])) {
                return new int[] {j, map.get(nums[j])};
            }
        }
        return new int[] {};
    }
}
