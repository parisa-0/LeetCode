class Solution {
    public int subtractProductAndSum(int n) {
/*
    int pro=1;
    int sum=0;;
    while (n > 0) {
    int r=n%10;
    pro=pro*r;
    sum=sum+r;
    n =n / 10;
} 
    int res=pro-sum;
    return res;  
     }
}
*/

        String stringVersionN = "" + n;
        int[] splitNumbers = new int[stringVersionN.length()];

        for(int i = 0; i < stringVersionN.length(); i++) {
            splitNumbers[i] = Character.getNumericValue(stringVersionN.charAt(i));
        }

        int sum = 0;
        int product = 1;

        for(int j = 0; j < splitNumbers.length; j++) {
            sum+= splitNumbers[j];
            product*= splitNumbers[j];
        }

        return product - sum;
    }
}
