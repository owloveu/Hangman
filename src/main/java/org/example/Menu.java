package org.example;

import java.util.Scanner;


public class Menu {

    private final static String NEW_GAME = "1";
    private final static String EXIT_GAME = "2";

    static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message.START_MENU.getText());
        String input = scanner.nextLine();
            switch (input) {
                case NEW_GAME:
                    newGame();
                    break;
                case EXIT_GAME:
                    exit();
                default:
                    System.out.println(Message.INVALID_INPUT.getText());
                    startMenu();
            }
        scanner.close();
    }

    private static void exit() {
        System.out.println(Message.EXIT.getText());
        System.exit(0);
    }

    private static void newGame(){
        System.out.println(Message.START_NEW_GAME.getText());
        HangmanGame game = new HangmanGame();
        game.startGame();
    }
}
