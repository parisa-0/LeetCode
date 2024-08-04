class Solution {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> positiveList = new LinkedList<>();
        List<Integer> negativeList = new LinkedList<>();

        for(int num : nums) {
            if(num < 0) {
                negativeList.add(num);
            }
            else {
                positiveList.add(num);
            }
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                result[i] = positiveList.get(0);
                positiveList.remove(0);
            }
            else {
                result[i] = negativeList.get(0);
                negativeList.remove(0);
            }
        }

        return result;
    }
}
