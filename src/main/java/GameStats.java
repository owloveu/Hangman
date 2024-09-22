import java.util.HashSet;
import java.util.Set;


class GameStats {

    private final Set<Character> guessedLetters = new HashSet<>();
    private int errorCount = 0;
    private final String wordToGuess;
    private final StringBuilder currentGuess;

    public GameStats() {
        WordHandler wordHandler = new WordHandler();
        this.wordToGuess = wordHandler.getRandomWord();
        this.currentGuess = new StringBuilder("*".repeat(wordToGuess.length()));
    }

    public void makeGuess(char guessedLetter) {
        guessedLetter = Character.toLowerCase(guessedLetter);
        if (!guessedLetters.add(guessedLetter)) {
            showGuessedLetters();
            return;
        }

        if (isCorrectGuess(guessedLetter)) {
            updateCurrentGuess(guessedLetter);
        } else {
            errorCount++;
        }
    }

    private void showGuessedLetters() {
        System.out.println(Message.GUESSED_LETTERS.getText());
        System.out.println(guessedLetters);
    }

    private boolean isCorrectGuess(char guessedLetter) {
        return wordToGuess.indexOf(guessedLetter) != -1;
    }

    private void updateCurrentGuess(char guessedLetter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guessedLetter) {
                currentGuess.setCharAt(i, guessedLetter);
            }
        }
    }

    public boolean isWordGuessed() {
        return currentGuess.toString().equals(wordToGuess);
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public String getCurrentGuess() {
        return currentGuess.toString();
    }

    public boolean isGameOver() {
        return errorCount >= 7 || isWordGuessed();
    }

    public int getErrorCount() {
        return errorCount;
    }
}