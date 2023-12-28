class Solution {
    public String sortSentence(String s) {
    String[] nums = s.split(" ");

        String[] finalNums = new String[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int orderIndex = Integer.parseInt("" + nums[i].charAt(nums[i].length() - 1)) - 1;
            finalNums[orderIndex] = nums[i].substring(0, nums[i].length() - 1);
        }
        
        String result = "";

        for (String finalNum : finalNums) {
            result = result + finalNum + " ";
        }
        
        return result.trim();
    }
}
