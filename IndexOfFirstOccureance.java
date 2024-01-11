// 28. Find the Index of the First Occurrence in a String
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
// Brute force approach:-
class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0, i = 0, index = -1;
        if (needle.length() > haystack.length()) {
            return -1;
        }

        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) {
                    index = i;
                }
                j++;
            } else if (j > 0) {
                i = index;
                j = 0;
                index = -1;
            }
            i++;
        }

        if (j < needle.length()) {
            return -1;
        } else {
            return index;
        }
    }
}


// Optimize Solution with Knuth-Morris-Pratt (KMP) algorithm

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int[] prefixArray = computePrefixArray(needle);

        int i = 0, j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            } else if (j > 0) {
                j = prefixArray[j - 1];
            } else {
                i++;
            }
        }

        return -1;
    }

    private int[] computePrefixArray(String needle) {
        int[] prefixArray = new int[needle.length()];
        int j = 0;

        for (int i = 1; i < needle.length(); i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = prefixArray[j - 1];
            }

            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }

            prefixArray[i] = j;
        }

        return prefixArray;
    }
}
