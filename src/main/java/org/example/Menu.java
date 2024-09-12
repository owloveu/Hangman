package org.example;

import java.util.Scanner;


public class Menu {

    private final static String NEW_GAME = "1";
    private final static String EXIT_GAME = "2";

    static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        Message.showMessage("startMenu");
        String input = scanner.nextLine();
            switch (input) {
                case NEW_GAME:
                    newGame();
                    break;
                case EXIT_GAME:
                    exit();
                default:
                    Message.showMessage("wrongInput");
                    startMenu();
            }
        scanner.close();
    }

    private static void exit() {
        Message.showMessage("exitMessage");
        System.exit(0);
    }
    //TODO указать на игровой цикл
    private static void newGame(){
        Message.showMessage("newGame");
    }
}
