package org.example;
/*
Класс Messages содержит сообщения, которые вызываются в определённые моменты программы
 */
public class Messages {

    protected static void menuMessage() {
        System.out.println("\nВыберите опцию:\n");
        System.out.println("1. Новая игра");
        System.out.println("2. Правила игры");
        System.out.println("3. Выход\n");
    }

    protected static void greetingMessage() {
        System.out.println("\nДобро пожаловать!");
    }

    protected static void fileNotFound() {
        System.out.println("\nФайл не найден, проверьте путь к файлу.");
    }

    protected static void fileIsEmpty() {
        System.out.println("\nФайл пуст");
    }

    protected static void requestLetter() {
        System.out.print("\nВведите букву: ");
    }

    protected static void wrongInputMessage() {
        System.out.println("\nПовторите попытку ввода: ");
    }

    protected static void exitMessage() {
        System.out.println("\nДо новых встреч!");
    }
    protected static void errorCountMessage() {
        System.out.println("\nКоличество ошибок выходит за пределы допустимого диапазона.");
    }
}
