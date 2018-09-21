/*
  Problem Statement: https://www.hackerrank.com/contests/nu-acm-w-coding-marathon/challenges/summing-the-n-series/problem
*/


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // you need to find the pattern in sum, and it will result in the sum of odd integers.
    // add it up with arithmetic sum formula, and you will see that it is n^2. However, you won't be able to find 
    // this value in the range of long => need to work with reminder theorem.
    // The code is only one line but touches many fundamental topics
    final static long mod = 1000000007;
    static int summingSeries(long n) {
        return (int)(((n%mod)*(n%mod))%mod);
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = summingSeries(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

