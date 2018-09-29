package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryCommandline {
    public  void showAllWords()
    {
        System.out.println("No | English | Vietnamese");
        int no = 0;
        for (Word word: Dictionary.myDic)
        {
            no = no + 1;
            System.out.println(no +" | "+word.getWord_target()+ " | "+ word.getWord_explain());
        }
    }

    public void dictionaryBasic()
    {
        DictionaryManagement.insertFromCommandline();
        showAllWords();
    }


}
