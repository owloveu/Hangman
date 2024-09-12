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

    private String getRandomWord() {
        if (listOfWords.isEmpty()) {
            Message.showMessage("emptyList");
        }
        Random random = new Random();
        return listOfWords.get(random.nextInt(listOfWords.size()));
    }

    private String maskWordToGuess() {
        return "*".repeat(wordToGuess.length());
    }

    public String getMaskedWord() {
        return maskWordToGuess();
    }

    public void printMaskedWord() {
        System.out.println(maskWordToGuess());
    }

    public void printWordToGuess() {
        System.out.println(wordToGuess.toUpperCase());
    }
}