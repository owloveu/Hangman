package org.example;

/*
Класс Main:
    Приветствует игрока;
    Запускает игру;
 */

public class Main {

    public static void main(String[] args) {
        Messages.greetingMessage();
        Hangman.startGame();
    }
}