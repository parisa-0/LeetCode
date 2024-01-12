class Solution {
    public int removeElement(int[] nums, int val) {

        List<Integer> myList = new LinkedList<>();
      
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
             myList.add(nums[i]);
            }
        }

        for(int j = 0; j < myList.size(); j++) {
            nums[j] = myList.get(j);
        }

        return myList.size();
    }
}
