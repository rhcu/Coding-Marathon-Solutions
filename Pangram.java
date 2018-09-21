/*
  Problem Statement: https://www.hackerrank.com/contests/nu-acm-w-coding-marathon/challenges/pangrams/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static String pangrams(String s) {
        // in C you will probably need to use memset function to set all array elements to be 0 initially
        // size 26 is equal to the number of letters in alphabet
        int[] arr = new int[26];
        // There could be lower and uppercase letters => need to make them all of similar type.
        // I used lowercase, but uppercase is fine too.
        s = s.toLowerCase();
        // find the frequency of each letter
        for(int i = 0; i<s.length(); i++){
            // need to skip whitespaces between words
            if(s.charAt(i) != ' '){
                arr[s.charAt(i) - 'a']++;
            }
        }
        // if some letter doesn't occur in the string, its frequency will be 0 => not a pangram
        for(int i: arr){
            if(i == 0) return "not pangram";
        }
        return "pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

