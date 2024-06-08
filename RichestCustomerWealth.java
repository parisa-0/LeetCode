class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int result = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                result += accounts[i][j];
            }
            if(result > max) {
                max = result;
            }
        }
       return max; 
    }
}
