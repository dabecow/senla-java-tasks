package com.senla.task.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Character.toUpperCase;

public class SentenceHandling {
    public static int getWordsCount(String sentence){
        String[] words =  sentence.split(" ");
        return words.length;
    }

    public static String capitalizeFirstLetters(String sentence){
        String[] words =  sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for (String word : words){
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            newSentence.append(word).append(" ");
        }
        return newSentence.toString();
    }

    public static String sortWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));

        StringBuilder newSentence = new StringBuilder();
        words.stream().sorted(String::compareTo).forEach((String word) -> newSentence.append(word).append("\n"));

        return newSentence.toString();
    }



}
