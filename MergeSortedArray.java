class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] output = new int[m + n]; 
        //i = 0, nums1[0] <= nums2[0] 1<=2 output[0] = nums1[0] = 1
        //i = 1, nums1counter 1, nums2counter 0 nums[1] <= nums2[0] 2 2 output[1] = nums1[1] = 2
        //i = 2, nums1counter 2, nums2counter 0 nums1[2] >= nums2[0] > nums2[2] output[2] = nums2[0] = 2
            int nums1Counter = 0;
            int nums2Counter = 0;
            for(int i = 0; i < m + n; i++) {

            if(nums1Counter == m && nums2Counter != n) {
                output[i] = nums2[nums2Counter];
                nums2Counter++;
            }
            else if(nums2Counter == n && nums1Counter != m) {
                output[i] = nums1[nums1Counter];
                nums1Counter++;
            }
           else if(nums1[nums1Counter] <= nums2[nums2Counter]) {
                output[i] = nums1[nums1Counter];
                nums1Counter++;
            }
            else if(nums1[nums1Counter] > nums2[nums2Counter]) {
                output[i] = nums2[nums2Counter];
                nums2Counter++;
            }
        }
        for(int j = 0; j < output.length; j++) {
       
                nums1[j] = output[j];
            
        }
    }
}
