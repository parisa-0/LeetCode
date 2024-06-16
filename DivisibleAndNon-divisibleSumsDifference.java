class Solution {
    public int differenceOfSums(int n, int m) {
        int areDivisibleBy3 = 0;
        int areNotDivisibleBy3 = 0;

        for(int i = 1; i <=n; i++) {
            if(i%m == 0) {
                areDivisibleBy3+=i;
            }
            else {
                areNotDivisibleBy3+=i;
            }
        }
        return areNotDivisibleBy3 - areDivisibleBy3;
    }
}
