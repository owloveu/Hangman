import java.util.List;
import java.util.Random;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WordHandler {

    private final List<String> listOfWords = new ArrayList<>();
    private final Path wordsPath = Paths.get("src", "resources", "words.txt");

    public WordHandler() {
        loadWordsToList();
    }

    private void loadWordsToList() {
        try (Scanner scanner = new Scanner(wordsPath.toFile())) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim().toLowerCase();
                if (!word.isEmpty()) {
                    listOfWords.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(Message.FILE_IS_EMPTY.getText());
        }
    }

    public String getRandomWord() {
        Random random = new Random();
        return listOfWords.get(random.nextInt(listOfWords.size()));
    }
}