package org.example;

import java.util.Scanner;

/*
пока не готово
 */
public class Hangman {
    private final String wordToGuess;
    private static final int MAX_ERRORS = 7;
    private final StringBuilder currentGuess;
    private int errorCount;

    public Hangman() {
        this.wordToGuess = RandomWord.getRandomWord();
        this.currentGuess = new StringBuilder();
    }

    static void startGame() {
        Menu.startMenu();
    }


    public void game() {
        Scanner scanner = new Scanner(System.in);
        while (!isGameOver()) {
            char guessedLetter = getGuessLetter();
            makeGuess(guessedLetter);
            if (isGameOver()) {
                if (isWin()) {
                    System.out.println("\nПоздравляем! Вы угадали слово: " + wordToGuess.toUpperCase());
                    startGame();
                } else {
                    System.out.println("\nВы проиграли. Слово было: " + wordToGuess.toUpperCase());
                    startGame();
                }
            }
        }
        scanner.close();
    }

    private boolean isWin() {
    }

    private char getGuessLetter() {
    }

    private void makeGuess(char guessedLetter) {
    }

    private boolean isGameOver() {
    }
}
