package com.v_stepanov.some_lines_of_code.tasks;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    private static long max;
    private static long multiplicand;
    private static long multiplier;
    static List listOfSimpleNumbers = new ArrayList();
    static List listOfMultiplications = new ArrayList();
    static List listOfPalindromes = new ArrayList();

    public static void main(String[] args) {

        createListOfSimpleNumbers();
        createListOfMultiplication();
        createListOfSimpleNumbers();
        createListOfPalindromes();

        maxOfPalindromes();
        System.out.println("max of palindromes " + max);

        calculateDividersOfMaxPalindrome();
        System.out.println("multiplicand is " + multiplicand);
        System.out.println("multiplier is " + multiplier);

    }

    private static void createListOfSimpleNumbers() {
        for (long j = 10_000; j < 11_000; j++) {
            if (isSimpleNumber(j) == true) {
                listOfSimpleNumbers.add(j);
            }
        }
    }

    public static boolean isSimpleNumber(long number) {
        int dividersCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividersCount++;
            }
        }
        return dividersCount == 2;
    }

    private static void createListOfMultiplication() {
        for (int i = 0; i < listOfSimpleNumbers.size();) {
            for (int j = 1; j < listOfSimpleNumbers.size(); j++) {
                listOfMultiplications.add((long) listOfSimpleNumbers.get(i) * (long) listOfSimpleNumbers.get(j));
            }
            listOfSimpleNumbers.remove(0);
        }
    }

    private static void createListOfPalindromes() {
        for (int i = 0; i < listOfMultiplications.size(); i++) {
            if (isPalindrome(String.valueOf(listOfMultiplications.get(i)))) {
                listOfPalindromes.add(listOfMultiplications.get(i));
            }
        }
    }

    public static boolean isPalindrome(String resultOfMultiplicationOfSimpleNumbers) {
        char firstCh;
        char lastCh;
        int size = resultOfMultiplicationOfSimpleNumbers.length();

        String subStr;
        if (size <=1) {
            return true;
        } else {
            firstCh = resultOfMultiplicationOfSimpleNumbers.toCharArray()[0];
            lastCh = resultOfMultiplicationOfSimpleNumbers.toCharArray()[ (size - 1)];
            subStr = resultOfMultiplicationOfSimpleNumbers.substring(1,(size - 1));

            return lastCh == firstCh && isPalindrome(subStr);
        }
    }

    private static void maxOfPalindromes() {
        System.out.println();
        for (int i = 0; i < listOfPalindromes.size(); i++) {
            if ((long) listOfPalindromes.get(i) > max) {
                max = (long) listOfPalindromes.get(i);
            }
        }
    }

    private static void calculateDividersOfMaxPalindrome() {
        for (int i = 0; i < listOfSimpleNumbers.size(); i++) {
            if (listOfPalindromes.size() == 0) {
                break;
            } else if (max % (long)listOfSimpleNumbers.get(i) == 0) {
                multiplicand = (long)listOfSimpleNumbers.get(i);
                multiplier = max / (long)listOfSimpleNumbers.get(i);
                break;
            }
        }
    }
}