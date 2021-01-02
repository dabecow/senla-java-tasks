package com.senla.task.fourth;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void runInterface(){
        String sentence, word;

        System.out.println("Enter the sentence");
        sentence = scanner.nextLine();
        System.out.println("Enter the word to count");
        word = scanner.nextLine();

        System.out.println("The sentence has " +
                WordCounter.getWordInsertions(sentence, word) +
                " insertions of the word " + word);

    }

    public static void main(String[] args) {
        while (true)
            runInterface();
    }
}
