//import java.math.BigInteger;
class Solution {
int trailingZeroes(int n) {

int count = 0;
for(int i = 5; n/i >= 1; i*=5) {
    count += n/i;
}

return count;

    /*
   Map<BigInteger, BigInteger> myMap = new HashMap<>();

    public BigInteger factorialFunc(BigInteger n) {
       // myMap.put(BigInteger.valueOf(0), BigInteger.valueOf(1));
      //  myMap.put(BigInteger.valueOf(1), BigInteger.valueOf(1));

        if(!myMap.containsKey(n.subtract(BigInteger.valueOf(1)))&& !n.equals(0) && !n.equals(1)) {
            myMap.put(n.subtract(BigInteger.valueOf(1)), factorialFunc(n.subtract(BigInteger.valueOf(1))));
        }

      return n.multiply(myMap.get(n.subtract(BigInteger.valueOf(1))));
     }

    public int trailingZeroes(int n) {
   
    BigInteger m = BigInteger.valueOf(n);


    int count = 0;

    BigInteger result = factorialFunc(m);
    String finalResult = result.toString();



        for (int i = finalResult.length() - 1; i > 0; i--) {
            if(finalResult.charAt(i) == '0') {
                count++;
            }
            else {
                break;
            }
        }
    return count;
    */
 
    }
}
