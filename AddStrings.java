class Solution {
    public String addStrings(String num1, String num2) {
             int remainder = 0;
        List<Integer> listNum1 = new ArrayList<>();
        List<Integer> listNum2 = new ArrayList<>();

        for (int i = num1.length() - 1; i >= 0; i--) {
            listNum1.add(num1.charAt(i) - '0');
        }

        for (int j = num2.length() - 1; j >= 0; j--) {
            listNum2.add(num2.charAt(j) - '0');
        }

        StringBuilder sb = new StringBuilder();

        int length = 0;

        if(listNum1.size() > listNum2.size()) {
            length = listNum1.size();
        }
        else {
            length = listNum2.size();
        }

        for(int i = 0; i < length; i++){
            if(i < listNum1.size() && i < listNum2.size()
                    && listNum1.get(i) + listNum2.get(i) + remainder > 9){
                sb.append((listNum1.get(i) + listNum2.get(i) + remainder)%10);
                remainder = 1;

            }
            else if (i < listNum1.size() && i < listNum2.size()
                    && listNum1.get(i) + listNum2.get(i) + remainder <= 9){
                sb.append(listNum1.get(i) + listNum2.get(i) + remainder);
                remainder = 0;
            }
            else if (i >= listNum1.size() && listNum2.get(i) + remainder > 9){
                sb.append((listNum2.get(i) + remainder)%10);
                remainder = 1;
            }
            else if (i >= listNum1.size() && listNum2.get(i) + remainder <= 9){
                sb.append(listNum2.get(i) + remainder);
                remainder = 0;
            }
            else if (i >= listNum2.size() && listNum1.get(i) + remainder > 9){
                sb.append((listNum1.get(i) + remainder)%10);
                remainder = 1;
            }
            else if (i >= listNum2.size() && listNum1.get(i) + remainder <= 9){
                sb.append(listNum1.get(i) + remainder);
                remainder = 0;
            }
        }

        if(remainder > 0) {
            sb.append(remainder);
        }

        return sb.reverse().toString();
    }
}
