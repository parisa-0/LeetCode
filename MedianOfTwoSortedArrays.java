class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> mergedArrays = new LinkedList<>();
        for(int i = 0; i < nums1.length + nums2.length; i++) {
            if(i < nums1.length) {
                mergedArrays.add(nums1[i]);
            }
            else {
                mergedArrays.add(nums2[i - nums1.length]);
            }
        }

        Collections.sort(mergedArrays);

        double result = 0.0;
        int middle = (nums1.length + nums2.length)/2;
        if((nums1.length + nums2.length)%2 != 0) {

            result = mergedArrays.get(middle);
        }
        else {

            result = ((double) (mergedArrays.get(middle - 1) + mergedArrays.get(middle)))/2;
        }
        return result;
    }
}
