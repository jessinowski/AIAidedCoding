package com.github;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Step 1:
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        // Step 2:
        String palindrome = "anna";
        String nonPalindrome = "hello";
        System.out.println(palindrome + " is a palindrome: " + isPalindrome(palindrome));
        System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));

        // Step 3:
        int n = 10; // Number of primes to generate
        List<Integer> primes = generatePrimes(n);
        System.out.println("First " + n + " prime numbers:");
        System.out.println(primes);
    }


    // Step 1:
    // Create a method that reverses a given string (e.g., "Hello" -> "olleH").
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Step 2:
    // Implement a function that checks if a given string is a palindrome (e.g., "anna" is a palindrome).

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at left and right positions don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If the loop completes without returning false, it's a palindrome
    }

    // Step 3:
    // Use AI-aided-coding to write a method that generates the first n prime numbers.

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Starting from 2, the first prime number

        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

