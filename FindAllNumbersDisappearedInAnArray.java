class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         Set<Integer> numsSet = new HashSet<>();

        for(int i = 1; i <= nums.length; i++){
            numsSet.add(i);
        }

        for(int num : nums) {
            if(numsSet.contains(num)) {
                numsSet.remove(num);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(numsSet);

        return result;

    }
}
