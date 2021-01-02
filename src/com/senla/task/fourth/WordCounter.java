package com.senla.task.fourth;

import java.util.Arrays;
import java.util.List;

public class WordCounter {

    public static int getWordInsertions(String sentence, String word){
        List<String> words = Arrays.asList(sentence.split(" "));
        return (int) words.stream().filter(w -> w.equals(word)).count();
    }

}
