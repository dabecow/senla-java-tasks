package com.senla.task.third;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void runInterface(){
        String sentence;

        System.out.println("Enter the sentence");
        sentence = scanner.nextLine();

        System.out.println("The sentence contains "
                + SentenceHandling.getWordsCount(sentence) + " letters");
        System.out.println("Sorted sentence:\n"
                + SentenceHandling.sortWords(sentence));
        System.out.println("The sentence with capitalized first letters:\n" +
                SentenceHandling.capitalizeFirstLetters(sentence));
    }

    public static void main(String[] args) {
        while (true)
            runInterface();
    }
}
