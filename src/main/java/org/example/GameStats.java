package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class GameStats {

    private final Set<Character> guessedLetters = new HashSet<>();
    private int errorCount = 0;
    private final String wordToGuess;
    private final StringBuilder currentGuess;

    public GameStats(String wordToGuess) {
        this.wordToGuess = wordToGuess.toLowerCase();
        this.currentGuess = new StringBuilder("*".repeat(wordToGuess.length()));
        new HangmanGraphic().displayHangmanStage(errorCount);
    }

//TODO упростить метод?
    public void makeGuess(char guessedLetter) {
        guessedLetter = Character.toLowerCase(guessedLetter);
        if (isAlreadyGuessed(guessedLetter)) {
            showGuessedLetters();
            return;
        }
        guessedLetters.add(guessedLetter);
        if (isCorrectGuess(guessedLetter)) {
            updateCurrentGuess(guessedLetter);
        } else {
            handleIncorrectGuess();
        }
    }


    private boolean isAlreadyGuessed(char guessedLetter) {
        return guessedLetters.contains(guessedLetter);
    }

    private void showGuessedLetters() {
        System.out.println(Message.GUESSED_LETTERS.getText());
        System.out.println(guessedLetters);
    }

    public boolean isCorrectGuess(char guessedLetter) {
        return wordToGuess.indexOf(guessedLetter) != -1;
    }

    private void updateCurrentGuess(char guessedLetter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guessedLetter) {
                currentGuess.setCharAt(i, guessedLetter);
            }
        }
    }


    private void handleIncorrectGuess() {
        errorCount++;
    }

    public static char userLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(Message.REQUEST_LETTER.getText());
            String userLetter = getUserInput(scanner).toLowerCase();
            if (isValidLetter(userLetter)) {
                return userLetter.charAt(0);
            } else {
                System.out.println(Message.INVALID_INPUT.getText());
            }
        }
    }

    public int getErrorCount() {
        return errorCount;
    }

    private static String getUserInput(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    private static boolean isValidLetter(String userLetter) {
        return userLetter.length() == 1 && userLetter.matches("[а-я]");
    }

    public boolean isWordGuessed() {
        return currentGuess.toString().equals(wordToGuess);
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public String getCurrentGuess() {
        return currentGuess.toString();
    }

    public boolean isGameOver() {
        int maxErrors = 7;
        return errorCount >= maxErrors || isWordGuessed();
    }
}
