class Solution {
    public int[] singleNumber(int[] nums) {
      Set<Integer> mySet = new HashSet<>();

       for (int i = 0; i < nums.length; i++) {
           if (mySet.contains(nums[i])) {
               mySet.remove(nums[i]);
           } else {
               mySet.add(nums[i]);
           }
       }

     int[] newNums = mySet.stream().mapToInt(Integer::intValue).toArray();
     return newNums;
    /*
        Map<Integer,Integer> map = new HashMap<>();
        int[] newNums = new int[2];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1 && newNums[0] == 0) {
                    newNums[0] = entry.getKey(); 
            }
            else if(newNums[0] != entry.getKey() && entry.getValue() == 1) {         
                newNums[1] = entry.getKey();
            }
        }

        return newNums;
        */
    
    }
}
