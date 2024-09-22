public class HangmanGame {

    private final GameStats gameStats;
    private final HangmanGraphic hangmanGraphic;
    private final UserInput inputHandler;

    public HangmanGame() {
        this.gameStats = new GameStats();
        this.hangmanGraphic = new HangmanGraphic();
        this.inputHandler = new UserInput();
    }

    public void startGame() {
        System.out.println(Message.WORD_TO_GUESS.getText());
        displayCurrentState();
        while (!gameStats.isGameOver()) {
            char guessedLetter = inputHandler.getUserLetter();
            gameStats.makeGuess(guessedLetter);
            hangmanGraphic.displayHangmanStage(gameStats.getErrorCount());
            displayCurrentState();
        }
        displayGameResult();
        Menu.startMenu();
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