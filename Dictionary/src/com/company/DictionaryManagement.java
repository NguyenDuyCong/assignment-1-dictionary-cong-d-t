package com.company;

import sun.applet.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {

    public static void insertFromCommandline() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of new word:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print("Input english word " + i + ": ");
            String english = sc.nextLine();
            System.out.print("Input vietnamese meaning " + i + ": ");
            String vietnamese = sc.nextLine();
            System.out.println();
            Word word = new Word(english, vietnamese);
            Dictionary.myDic.add(new Word(english, vietnamese));
        }
        sc.close();
    }
    public  static void insertFromFile()
    {
        try {
            FileReader fileReader = new FileReader("src\\com\\company\\dictionaries.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine())!=null)
            {
                String [] read_word = line.split("\t");
                String english = read_word[0];
                String vietnamese = read_word[1];
                Dictionary.myDic.add(new Word(english,vietnamese));
            }
            reader.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found!");
        } catch (IOException ex)
        {
            System.out.println("Unexpected error reading file");
        }
    }
    public static String dictionaryLookup(String english_word)
    {
        String ans = "word not found";
        for (Word word: Dictionary.myDic)
        {
            if (word.getWord_target().equals(english_word))
            {
                return word.getWord_explain();
            }
        }
        return ans;
    }

    public static void deleteWord (String english_word)
    {
        for (Word word: Dictionary.myDic)
        {
            if (word.getWord_target().equals(english_word))
            {
                Dictionary.myDic.remove(word);
                break;
            }
        }
    }

    public static ArrayList<Word> dictionarySearcher(String english_word)
    {
        ArrayList<Word> res = new ArrayList<Word>();
        for (Word word: Dictionary.myDic)
        {
            if (word.getWord_target().substring(0,english_word.length()).equals(english_word))
            {
                res.add(word);
                break;
            }
        }

        return res;
    }
}


