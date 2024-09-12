package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordLoader {

    private final List<String> listOfWords = new ArrayList<>();
    final Path WORDS_PATH = Paths.get("src","resources","words.txt");
    final File WORDS_FILE = WORDS_PATH.toFile();

    private void loadWordsToList() {
        try (Scanner scanner = new Scanner(WORDS_FILE)) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                if (!word.isEmpty()) {
                    listOfWords.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            Message.showMessage("fileNotFound");
        }
    }

    public List<String> getListOfWords() {
        if (listOfWords.isEmpty()) {
            loadWordsToList();
        }
        return listOfWords;
    }
}
