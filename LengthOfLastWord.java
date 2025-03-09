///**
//Question- 58. Length of Last Word.
//Description -
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//
//link:- https://leetcode.com/problems/length-of-last-word/description/
// */
//
//
//// Sol-1: Brute force
//
//public int lengthOfLastWord(String s) {
//        int j = -1; int k = -1;
//
//        for(int i = s.length()-1; i >= 0; i--){
//            if(!(s.charAt(i) == ' ') && j == -1){
//                j = i;
//                k = i;
//            }else if(!(s.charAt(i) == ' ') && j != -1){
//                k = i;
//            }else if(s.charAt(i) == ' ' && k != -1){
//                break;
//            }
//        }
//        String out = s.substring(k, j+1);
//        return out.length();
//    }
//
//
//
//
////Sol-2: With StringTokenizer
//
//public int lengthOfLastWord(String s) {
//
//        StringTokenizer st=new StringTokenizer(s," ");
//        String temp="";
//        while(st.hasMoreTokens())
//        {
//            temp=st.nextToken();
//        }
//        return temp.length();
//    }