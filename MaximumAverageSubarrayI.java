class Solution {
    //https://www.youtube.com/watch?v=jhW7VwP2Djw&t=1653s
    public double findMaxAverage(int[] nums, int k) {

        //Sliding Window

        double windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxAverage = windowSum/k;

        for(int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i-k] + nums[i];
            maxAverage = Math.max(maxAverage, windowSum/k);
        }

        /* Naive approach
        double maxAverage = -Double.MAX_VALUE;
 
      
        for(int i = 0; i <= nums.length - k; i++) {
                   double totalSum = 0; 
            for(int j = i; j < i + k; j++) { 
                if(i + k <= nums.length) {
                    totalSum += nums[j]; 
                }       
            }
              if(totalSum/k > maxAverage) {
                    maxAverage = totalSum/k;
                }
        }
        */
        return maxAverage;
    }
}
