package org.example;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    public char getUserLetter() {
        System.out.println(Message.REQUEST_LETTER.getText());
        while (true) {
            String userLetter = scanner.nextLine().trim().toLowerCase();
            if (userLetter.length() == 1 && userLetter.matches("[а-я]")) {
                return userLetter.charAt(0);
            }
            System.out.println(Message.INVALID_INPUT.getText());
        }
    }
    public String getUserInput() {
        return scanner.nextLine().trim();
    }
}