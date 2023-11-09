class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] answer = new int[2];

        int aliceSum = 0;
        int bobSum = 0;

        for(int i = 0; i < aliceSizes.length; i++) {
            aliceSum = aliceSum + aliceSizes[i];
        }

        for(int j = 0; j < bobSizes.length; j++) {
            bobSum = bobSum + bobSizes[j];
        }

        for(int k = 0; k < aliceSizes.length; k++) {
            for(int m = 0; m < bobSizes.length; m++) {
                if(aliceSum - aliceSizes[k] + bobSizes[m] == bobSum - bobSizes[m] + aliceSizes[k]) {
                    answer[0] = aliceSizes[k];
                    answer[1] = bobSizes[m];
                    return answer;
                }
            }
        }
        return answer;
    }
}
