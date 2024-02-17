public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String nBinary = Integer.toBinaryString(n);

        int count = 0;
        for(int i = 0; i < nBinary.length(); i++) {
            if(nBinary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
