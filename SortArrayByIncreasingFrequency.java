class Solution {
    public int[] frequencySort(int[] nums) {
      Map<Integer, Integer> myMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        });

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(myMap.entrySet());

        Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                if(a.getValue() != b.getValue()) {
                       return a.getValue().compareTo(b.getValue());
                }
                else {
                    return b.getKey().compareTo(a.getKey());
                }
            }
        };
     
        Collections.sort(entries, comparator);
      
        int[] result = new int[nums.length];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            while(entry.getValue() > 0) {
                result[count] = entry.getKey();
                myMap.put(entry.getKey(), entry.getValue() - 1);
                count++;
            }
        }
        return result;
    }
}
