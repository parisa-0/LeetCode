class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      //  Set<Integer> mySet = new HashSet<>();
      int counter = 0;

        for(int i = 0; i < hours.length; i++) {
            if(hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }
}
