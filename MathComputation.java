/*
HackerRank Link  - https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int term = a;
        for (int j = 0; j < n; j++) {
            term += (int) Math.pow(2, j) * b;
            System.out.print(term + " ");
        }
        System.out.println();
        }
        in.close();
    }
}