package com.example.kcci.shufflesentenceex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleSentence {

    public void shuffleSentence(List<String> shuffle) {


        int shufflesize = shuffle.size();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < shufflesize; i++) {
            list.add(shuffle.get(i));
//            System.out.println(list.get(i));
        }

        Collections.shuffle(list);

        for (int i = 0; i < shufflesize; i++) {

            System.out.println(list.get(i));
        }

    }
}
