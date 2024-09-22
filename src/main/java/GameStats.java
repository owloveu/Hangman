import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GameStats {
    private final Set<Character> guessedLetters = new HashSet<>();
    private int errorCount = 0;
    private final String wordToGuess;
    private final StringBuilder currentGuess;
    private static final int MAX_ERRORS = 7;

    public GameStats(WordHandler wordHandler) {
        this.wordToGuess = wordHandler.getRandomWord();
        this.currentGuess = new StringBuilder("*".repeat(wordToGuess.length()));
    }

    public boolean makeGuess(char guessedLetter) {
        guessedLetter = Character.toLowerCase(guessedLetter);
        boolean isNewGuess = guessedLetters.add(guessedLetter);
        if (!isNewGuess) {
            return false;
        }
        if (wordToGuess.indexOf(guessedLetter) >= 0) {
            updateCurrentGuess(guessedLetter);
        } else {
            errorCount++;
        }
        return true;
    }

    private void updateCurrentGuess(char guessedLetter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guessedLetter) {
                currentGuess.setCharAt(i, guessedLetter);
            }
        }
    }

    public Set<Character> getGuessedLetters() {
        return Collections.unmodifiableSet(guessedLetters);
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
        return errorCount >= MAX_ERRORS || isWordGuessed();
    }

    public int getErrorCount() {
        return errorCount;
    }
}