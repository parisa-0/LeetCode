class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> numsValuesAndCount = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numsValuesAndCount.containsKey(nums[i]) && numsValuesAndCount.get(nums[i]) == 2) {
                continue;
            }
            else {
                numsValuesAndCount.put(nums[i], numsValuesAndCount.getOrDefault(nums[i], 0)+1);
            }
        }

        List<Integer> nums2 = new LinkedList<>();
    
        for (Map.Entry<Integer, Integer> entry : numsValuesAndCount.entrySet()) {
           if(entry.getValue() >= 2) {
            nums2.add(entry.getKey());
            nums2.add(entry.getKey());
           }
           else if(entry.getValue() != 2) {
             nums2.add(entry.getKey());
           }
       }

       for(int j = 0; j < nums2.size(); j++) {
        nums[j] = nums2.get(j);
       }
        return nums2.size();
    }
}
