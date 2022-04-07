package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = in.nextLine();
        String[] words = str1.split(" ");
        System.out.println("Самое длинное слово: " + maxLengthWord(words));
    }

    private static String maxLengthWord(String[] s) {
        int len = 0;
        String longest = "";
        for (String string : s) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;
    }
}