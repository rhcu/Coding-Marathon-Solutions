/*
Problem Statement: https://www.hackerrank.com/challenges/the-power-sum/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int powerSum(int value, int exponent) {
        // returns a call to recursive helper function with additional parameter - base
        return powerSum(value, exponent, 1); 
    }
    
    // Helper function for recursion
    static int powerSum(int value, int exponent, int base) {
        // base^power
        int currentPower = (int) Math.pow(base, exponent);
        
        // what is remaining after substraction should also be represented as a sum of powers
        int valueRemaining = value - currentPower; 

        // exceeded the num we're trying to match => return since negatives are not allowed
        if(currentPower > value) return 0;
        
        // matched our num, we've found one way to do it
        else if(currentPower == value) return 1;

        // first recursive call is trying to see if the current base was a part of the solution
        // second recursive call is exploring the path that the current base was not a part of the solution
        return powerSum(value, exponent, base + 1) + powerSum(valueRemaining, exponent, base + 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

