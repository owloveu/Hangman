package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Класс FileProcessor работает с текстовыми файлами проекта
    1. Для файла words.txt:
        FileProcessor:
            Инициализирует пустой список listOfWords
        loadWordsToList:
            1) Добавляет в массив ListOfWords содержимое файла
            2) Сообщение об ошибке, если файл со словами пустой
            3) Сообщение об ошибке, если путь некорректный
        getListOfWords
            1) Вызывает метод loadWordsToList
            2) Возвращает массив listOfWords
    2. Для файла rules.txt:
        Метод readFileRules:
            1) Сообщение об ошибке, если путь некорректный
            2) Выводит в консоль правила игры
 */

class FileProcessor {

    private final List<String> listOfWords;
    //Локальные константы, используемые только здесь
    private static final File WORDS_FILE_PATH = new File("src/main/resources/words.txt");
    private static final File RULES_FILE_PATH = new File("src/main/resources/rules.txt");

    public FileProcessor() {
        this.listOfWords = new ArrayList<>();
    }

    void loadWordsToList() {
        try {
            Scanner scanner = new Scanner(WORDS_FILE_PATH);
            while (scanner.hasNextLine()) {
                listOfWords.add(scanner.nextLine());
            }
            scanner.close();
            if (listOfWords.isEmpty()) {
               Messages.fileIsEmpty();
            }
        } catch (FileNotFoundException e) {
           Messages.fileNotFound();
        }
    }

    public List<String> getListOfWords() {
        loadWordsToList();
        return listOfWords;
    }

    protected static void readFileRules() {
        Scanner scanner;
        try {
            scanner = new Scanner(RULES_FILE_PATH);
        } catch (FileNotFoundException e) {
            Messages.fileNotFound();
            return;
        }
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
