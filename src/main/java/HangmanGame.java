public class HangmanGame {

    private final GameStats gameStats;
    private final HangmanGraphic hangmanGraphic;
    private final UserInput userInput;

    public HangmanGame(GameStats gameStats, HangmanGraphic hangmanGraphic, UserInput userInput) {
        this.gameStats = gameStats;
        this.hangmanGraphic = hangmanGraphic;
        this.userInput = userInput;
    }

    public void startGame() {
        System.out.println(Message.WORD_TO_GUESS.getText());
        displayCurrentState();
        while (!gameStats.isGameOver()) {
            char guessedLetter = userInput.getUserLetter();
            boolean isNewGuess = gameStats.makeGuess(guessedLetter);
            if (!isNewGuess) {
                System.out.println(Message.GUESSED_LETTERS.getText() + gameStats.getGuessedLetters());
                continue;
            }
            hangmanGraphic.displayHangmanStage(gameStats.getErrorCount());
            displayCurrentState();
        }
        displayGameResult();
    }

    private void displayCurrentState() {
        System.out.println(gameStats.getCurrentGuess());
    }

    private void displayGameResult() {
        String message = gameStats.isWordGuessed() ? Message.WIN_MESSAGE.getText() : Message.LOSE_MESSAGE.getText();
        System.out.println(message);
        if (!gameStats.isWordGuessed()) {
            System.out.println(gameStats.getWordToGuess());
        }
    }
}