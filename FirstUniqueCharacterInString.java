class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> myMap = new LinkedHashMap<>();

        s.chars().forEach(c -> {
            myMap.put((char) c, myMap.getOrDefault((char) c, 0) + 1);
        });

        final int[] result = {-1};
        myMap.entrySet().stream().forEach(e -> {
            if(e.getValue() == 1 && result[0] == -1) {
              result[0] = s.indexOf(e.getKey());
            }
        });

        return result[0];
    }
}
