package org.example;

public class Menu {

    private final UserInput userInput = new UserInput();
    private final static String NEW_GAME = "1";
    private final static String EXIT_GAME = "2";

    static void startMenu() {
        Menu menu = new Menu();
        menu.displayMenu();
    }

    private void displayMenu() {
        System.out.println(Message.START_MENU.getText());
        String input = userInput.getUserInput();

        switch (input) {
            case NEW_GAME -> newGame();
            case EXIT_GAME -> exit();
            default -> {
                System.out.println(Message.INVALID_INPUT.getText());
                displayMenu();
            }
        }
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
