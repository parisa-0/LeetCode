class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] shortestArray;
        int[] longestArray;

        if(nums1.length >= nums2.length) {
            shortestArray = nums2;
            longestArray = nums1;
        }
        else {
            shortestArray = nums1;
            longestArray = nums2;
        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < shortestArray.length; i++) {
            for(int j = 0; j < longestArray.length; j++) {
                if(shortestArray[i] == longestArray[j]) {
                    map.put(shortestArray[i], map.getOrDefault(shortestArray[i],0)+1);
                    break;
                }
            }
        }
           
    int index = 0;
    int[] nums3 = new int[map.size()];
    for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
    nums3[index] = mapEntry.getKey();
    index++;
}
return nums3;
    }
}
