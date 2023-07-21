package SolvedLeetCode;

import java.util.*;
//https://leetcode.com/problems/most-frequent-even-element/

class frequentEvenNumber {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        if (map.isEmpty()) {
            return -1;
        }


        Map.Entry<Integer, Integer> actualValue = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == Collections.max(map.values()))
                .sorted(Map.Entry.<Integer, Integer>comparingByKey())
                .findFirst()
                .get();

        return actualValue.getKey();
    }
}