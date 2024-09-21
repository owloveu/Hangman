package org.example;

import java.util.List;
import java.util.Random;

public class WordHandler {

    private final List<String> listOfWords;
    private final String wordToGuess;

    public WordHandler() {
        WordLoader fp = new WordLoader();
        this.listOfWords = fp.getListOfWords();
        this.wordToGuess = getRandomWord();
    }

    public String getRandomWord() {
        if (listOfWords.isEmpty()) {
            System.out.println(Message.FILE_IS_EMPTY.getText());
        }
        Random random = new Random();
        return listOfWords.get(random.nextInt(listOfWords.size()));
    }

    private String maskWordToGuess() {
        return "*".repeat(wordToGuess.length());
    }

    public void printMaskedWord() {
        System.out.println(maskWordToGuess());
    }
}