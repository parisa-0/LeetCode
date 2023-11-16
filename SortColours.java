class Solution {
    public void sortColors(int[] nums) {
        
             Map<Integer,Integer> map = new HashMap<>();

    
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
      int[] output = new int[nums.length];
        int counter = 0;
        
        for(int j = 0; j < output.length; j++) {
        if(map.containsKey(0) && counter - j < map.get(0)) {
             System.out.println(j + " at 0");
            output[j] = 0;
            map.put(0, map.get(0) - 1);
            counter++;
        }
        else if(map.containsKey(1) && counter - j < map.get(1)) {
            System.out.println(j + " at 1");
            output[j] = 1;
            map.put(1, map.get(1) - 1);
            counter++;
        }
        else if(map.containsKey(2) && counter - j < map.get(2)) {
            System.out.println(j + " at 2");
            output[j] = 2;
            map.put(2, map.get(2) - 1);
            counter++;
        }
        }
        
        for(int k = 0; k < output.length; k++) {
            nums[k] = output[k];
        }
    }
}
