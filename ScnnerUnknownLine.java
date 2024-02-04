// HackerRank Link :- https://www.hackerrank.com/challenges/java-end-of-file/problem?h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_v%5B%5D=zen&h_v%5B%5D=zen&h_v%5B%5D=zen&h_v%5B%5D=zen&isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ScnnerUnknownLine {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNextLine()){
                String s = sc.nextLine();
                if(s.equals("")) break; 
                System.out.println(i + " " + s);
                i++;
            }
    }
}