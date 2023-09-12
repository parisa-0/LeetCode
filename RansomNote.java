class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

               for (int i = 0; i < ransomNote.length(); i++) {
            if (!magazineMap.containsKey(ransomNote.charAt(i))) {
                return false;
            }
            else if (magazineMap.containsKey(ransomNote.charAt(i)) && magazineMap.containsValue(1)) {
                magazineMap.put(ransomNote.charAt(i), magazineMap.get(ransomNote.charAt(i)) - 1);
                magazineMap.values().remove(0);
            }
            else if (magazineMap.containsKey(ransomNote.charAt(i)) && !magazineMap.containsValue(0)){
                magazineMap.put(ransomNote.charAt(i), magazineMap.get(ransomNote.charAt(i)) - 1);
            }
        }

        return true;

    }
}
