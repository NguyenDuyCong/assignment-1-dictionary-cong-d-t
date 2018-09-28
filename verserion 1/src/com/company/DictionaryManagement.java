package com.company;

import sun.applet.Main;

import java.util.Scanner;

public class DictionaryManagement {

    public static void insertFromCommandline() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of new word:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 1; i <= n; i++){
            System.out.print("Input english word "+ i +": ");
            String english = sc.nextLine();
            System.out.print("Input vietnamese meaning "+i+": ");
            String vietnamese = sc.nextLine();
            System.out.println();
            Word word = new Word(english, vietnamese);
            Dictionary.myDic.add(new Word(english,vietnamese));
        }
        sc.close();
    }

}

