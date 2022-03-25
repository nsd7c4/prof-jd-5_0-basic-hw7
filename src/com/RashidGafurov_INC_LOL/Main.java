package com.RashidGafurov_INC_LOL;

import java.util.Locale;

public class Main {
    //Assignment 6
    public static String toCorrectCase(String s) {
        String trimmed = s.trim().toLowerCase(Locale.ROOT);
        char[] t = trimmed.toCharArray();
        t[0] = Character.toUpperCase(t[0]);
        for (int i = 1; i < t.length; i++) {
            if (t[i] == ' ') {
                t[i + 1] = Character.toUpperCase(t[i + 1]);
            }
        }
        return new String(t);
    }

    public static void main(String[] args) {
        //Assignment 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Full name of employee is " + fullName);

        //Assignment 2
        String capitalizedFullname = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Full name of employee for the report is " + capitalizedFullname);

        //Assignment 3
        String fullName2 = "Иванов Семён Семёнович";
        String adjustedFullName2 = fullName2.replace('ё', 'e');
        System.out.println("Full name of employee is " + adjustedFullName2);

        //Assignment 3, attempt 2
        String fullName3 = "Иванов Семён Семёнович";
        StringBuilder adjustedFullName3 = new StringBuilder();
        if (fullName3.contains("ё")) {
            String[] temp = fullName3.split("ё");
            for (int i = 0; i < temp.length; i++) {
                adjustedFullName3.append(temp[i]);
                if (i < temp.length - 1) {
                    adjustedFullName3.append("е");
                }
            }
        }

        System.out.println("Full name of employee is " + adjustedFullName3);

        //Assignment 5
        String fullName5 = "Ivanov Ivan Ivanovich";
        int firstSpace = fullName5.indexOf(" ");
        int lastSpace = fullName5.lastIndexOf(" ");
        String firstName5 = fullName5.substring(firstSpace + 1, lastSpace);
        System.out.println("First name is " + firstName5);
        String middleName5 = fullName5.substring(lastSpace + 1);
        System.out.println("Middle name is " + middleName5);
        String lastName5 = fullName5.substring(0, firstSpace);
        System.out.println("Last name is " + lastName5);

        //Assignment 6
        String fullName6 = "ivanov ivan ivanovich";
        System.out.println("Proper Full name of employee is " + toCorrectCase(fullName6) + "!");

        //Assignment 7
        String firstString = "135";
        String secondString = "246";
        StringBuilder resultString = new StringBuilder();
        if (firstString.length() == secondString.length()) {
            for (int k = 0; k < firstString.length(); k++) {
                resultString.append(firstString.charAt(k));
                resultString.append(secondString.charAt(k));
            }
        }
        System.out.println("Combined strings is " + resultString);

        //Assignment 8
        String s = "aabccddefgghiijjkk";
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int i;
        int j;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
