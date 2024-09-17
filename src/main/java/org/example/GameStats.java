package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

//TODO начать и кончить
public class GameStats {
    private final Set<Character> guessedLetters = new HashSet<>();
    private final int maxErrors = 7;  // Максимальное количество ошибок
    private int errorCount = 0;
    private String wordToGuess;
    private StringBuilder currentGuess;

    public GameStats(String wordToGuess) {
        this.wordToGuess = wordToGuess.toLowerCase();  // Загаданное слово
        this.currentGuess = new StringBuilder("*".repeat(wordToGuess.length()));
        new HangmanGraphic().displayHangmanStage(errorCount);
    }

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

    // Метод для проверки, была ли буква уже угадана
    private boolean isAlreadyGuessed(char guessedLetter) {
        return guessedLetters.contains(guessedLetter);
    }

    // Метод для вывода списка уже угаданных букв
    private void showGuessedLetters() {
        System.out.println(Message.GUESSED_LETTERS.getText());
        System.out.println(guessedLetters);
    }

    // Метод для проверки, есть ли угаданная буква в слове
    public boolean isCorrectGuess(char guessedLetter) {
        return wordToGuess.indexOf(guessedLetter) != -1;
    }

    // Метод для обновления текущего состояния слова при правильной букве
    private void updateCurrentGuess(char guessedLetter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guessedLetter) {
                currentGuess.setCharAt(i, guessedLetter);
            }
        }
    }

    // Метод для обработки неправильной буквы
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
        return errorCount >= maxErrors || isWordGuessed();
    }
}
