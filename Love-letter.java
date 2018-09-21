/*
  Problem Statement: https://www.hackerrank.com/contests/nu-acm-w-coding-marathon/challenges/the-love-letter-mystery/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // All you need is to find the absolute difference between symmetric characters ASCII values and sum them up
    static int theLoveLetterMystery(String s) {
        int count = 0;
        int len = s.length();
        for(int i = 0; i < s.length()/2; i++){
            count += Math.abs(s.charAt(i) - s.charAt(len - i - 1));
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

