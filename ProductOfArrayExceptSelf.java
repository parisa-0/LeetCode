class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] forwardArray = new int[nums.length];
        int[] backwardArray = new int[nums.length];
        int[] newNums = new int[nums.length];

        forwardArray[0] = 1;
        int productOfForwardArray = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            productOfForwardArray *= nums[i];
            forwardArray[i+1] = productOfForwardArray;
        }

        backwardArray[nums.length-1] = 1;
        int productOfBackwardArray = 1;

        for (int j = backwardArray.length - 1; j > 0 ; j--) {
            productOfBackwardArray *= nums[j];
            backwardArray[j-1] = productOfBackwardArray;
        }

        for(int k = 0; k < nums.length;k++) {
            newNums[k] = forwardArray[k] * backwardArray[k];
        }

        return newNums;
        
   /*
    int[] newNums = new int[nums.length];
        int productBeginning = 1;
        int index = 0;
        int product = 1;    

        for(int i = 0; i < nums.length; i++) {
            product = productBeginning;
            for(int j = i+1; j < nums.length; j++) {
                product = product * nums[j];
            }
            productBeginning = productBeginning * nums[i];
            newNums[i] = product;
        }
    return newNums;
    */
    }
}
