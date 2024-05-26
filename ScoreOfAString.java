class Solution {
    public int scoreOfString(String s) {
        char[] sArray = s.toCharArray();
        List<Integer> sArrayList = new LinkedList<>();

        for (char c : sArray) {
            sArrayList.add((int) c);
        }

        int result = 0;

        for (int i = 0; i < sArrayList.size()-1; i++) {
            result += Math.abs(sArrayList.get(i) - sArrayList.get(i+1));
        }
        return result;
    }
}
