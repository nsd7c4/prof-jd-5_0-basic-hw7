package com.RashidGafurov_INC_LOL;

import java.util.Locale;

public class Main {

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
    }
}
