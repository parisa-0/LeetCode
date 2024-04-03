class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
           if (mySet.contains(nums[i])) {
               mySet.remove(nums[i]);
           } else {
               mySet.add(nums[i]);
           }
       }
        List<Integer> listMySet = new ArrayList<>();
        listMySet.addAll(mySet);

        return listMySet.get(0);    
    }
}
