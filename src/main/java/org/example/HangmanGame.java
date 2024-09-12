package org.example;

import java.util.HashSet;
import java.util.Set;

//TODO прописать цикл
//TODO прописать корректный конструктор
//TODO прописать корректные переменные

public class HangmanGame {
    private final StringBuilder currentGuess;
    private final Set<Character> guessedLettes;

    public HangmanGame() {
        this.currentGuess = new StringBuilder();
        int errorCount = 7;
        new HangmanGraphic().displayHangmanStage(errorCount);
        this.guessedLettes = new HashSet<>();
    }
}
