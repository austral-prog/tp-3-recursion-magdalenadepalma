package com.recursion;

import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        return recursiveIndexOfByIndex(list, target, 0);
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (index >= list.size()){
            return -1;
        }
        if (list.get(index).equals(target)){
            return index;
        } else {
            return recursiveIndexOfByIndex(list, target, index + 1);
        }

    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOfByIndex(list, "", 0);
    }

    public static int recursivePut(String target, List<String> list) {
        int indice = recursiveIndexOfByIndex(list, "", 0);
        if (indice == -1) {
            return -1;
        }
        list.set(indice, target);
        return indice;
    }

    public static int recursiveRemove(List<String> list, String target) {
        int indice = recursiveIndexOfByIndex(list, target, 0);
        if (indice == -1) {
            return 0;
        }
        list.remove(indice);
        return 1 + recursiveRemove(list, target);
    }

    public static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(0) + recursiveSum(list.subList(1, list.size()));
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * recursivePow(base, exponent - 1);
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static boolean recursivePalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        return recursivePalindrome(word.substring(1, word.length() - 1));
    }


}
