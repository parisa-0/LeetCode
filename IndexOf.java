package SolvedLeetCode;

public class IndexOf {


    // Find the Index of the First Occurrence in a String
    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

    public static int strStr(String haystack, String needle) {
        System.out.println(haystack.indexOf(needle));
        return haystack.indexOf(needle);

    }
    public static void main(String[] args) {
       String haystack = "sadbutsad";
       String needle = "sad";
       strStr(haystack, needle);
    }
}


