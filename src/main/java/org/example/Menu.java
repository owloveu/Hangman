package org.example;

import java.util.Scanner;

/*
Класс Menu реализует следующий функционал:
    startMenu запрашивает пользовательский ввод:
        1) Начать новую игру;
        2) Посмотреть правила игры, возвращает пользователя обратно в меню;
        3) Выход из игры;
        При некорректном вводе символа выдаёт сообщение об ошибке, возвращает пользователя обратно в меню;
    exit
        Прощается с пользователем;
        Закрывает приложение;
 */

public class Menu {

    protected static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        Messages.menuMessage();
        String input = scanner.nextLine();
            switch (input) {
                case "1":
                    Hangman.game();
                    break;
                case "2":
                    FileProcessor.readFileRules();
                    startMenu();
                    break;
                case "3":
                    exit();
                default:
                    Messages.wrongInputMessage();
                    startMenu();
            }
        scanner.close();
    }

    private static void exit() {
        Messages.exitMessage();
        System.exit(0);
    }
}
