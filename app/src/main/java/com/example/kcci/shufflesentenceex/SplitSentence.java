package com.example.kcci.shufflesentenceex;

import java.util.ArrayList;
import java.util.List;

public class SplitSentence {

    public void splitString(String splitsentence){


        ShuffleSentence shuffleSentence = new ShuffleSentence();
        List<String> list = new ArrayList<>();

        String[] stringArr = splitsentence.split("/");


        for(int i=0;i<stringArr.length;i++){


            list.add(stringArr[i]);
//            System.out.println(list.get(i));
        }

        shuffleSentence.shuffleSentence(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
    }
}
