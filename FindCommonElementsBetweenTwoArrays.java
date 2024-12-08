class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int[] result = new int[2];

        Set<Integer> nums1Set = Arrays.stream(nums1)
                .boxed() 
                .collect(Collectors.toSet());

        Set<Integer> nums2Set = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());
        
        int count = 0;
        for (int i : nums1) {
            if(nums2Set.contains(i)) {
                count++;
            }
        }
        
        int count2 = 0;
        for (int i : nums2) {
            if(nums1Set.contains(i)) {
                count2++;
            }
        }
        /*
         int count = (int) Arrays.stream(nums1)
                .filter(e -> Arrays.stream(nums2).anyMatch(n -> n == e))
                .count();

        int count2 = (int) Arrays.stream(nums2)
                .filter(e -> Arrays.stream(nums1).anyMatch(n -> n == e))
                .count();
*/
        result[0] = count;
        result[1] = count2;

        return result;
    }
}
