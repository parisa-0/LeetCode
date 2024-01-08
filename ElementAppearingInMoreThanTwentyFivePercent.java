class Solution {
    public int findSpecialInteger(int[] arr) {

        int n = arr.length;
        int twentyFivePercent = n / 4;

        for (int i = 0; i < n - twentyFivePercent; i++) {
            if (arr[i] == arr[i + twentyFivePercent]) {
                return arr[i];
            }
        }

        return -1; 
        /*
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            myMap.put(arr[i], myMap.getOrDefault(arr[i],0)+1);
        }
        
        int twentyFivePercent = arr.length/4;
        int max = 0;

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if(entry.getValue() > twentyFivePercent) {
                max = entry.getKey();
            }
        }
        return max;
        */
    }
}
