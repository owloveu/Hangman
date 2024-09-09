package org.example;

import java.util.List;
import java.util.Random;


public class RandomWord {
    static List<String> randomWord;
    //метод
    private static void initializeListOfWords(){
        FileProcessor fp = new FileProcessor();
        randomWord = fp.getListOfWords();
    }
    // Метод для получения случайного слова во внешних классах
    public static String getRandomWord() {
        initializeListOfWords();
        Random random = new Random();
        return randomWord.get(random.nextInt(randomWord.size()));
    }
}