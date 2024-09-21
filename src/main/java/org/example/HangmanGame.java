package org.example;

public class HangmanGame {

    private final GameStats gameStats;
    private final WordHandler wordHandler;
    private final HangmanGraphic hangmanGraphic;

    public HangmanGame() {
        this.wordHandler = new WordHandler();
        String wordToGuess = wordHandler.getRandomWord();
        this.gameStats = new GameStats(wordToGuess);
        this.hangmanGraphic = new HangmanGraphic();
    }

    public void startGame() {
        System.out.println(Message.WORD_TO_GUESS.getText());
        wordHandler.printMaskedWord();
        while (!gameStats.isGameOver()) {
            char guessedLetter = GameStats.userLetter();
            gameStats.makeGuess(guessedLetter);
            hangmanGraphic.displayHangmanStage(gameStats.getErrorCount());
            System.out.println(gameStats.getCurrentGuess());
        }
        if (gameStats.isWordGuessed()) {
            System.out.println(Message.WIN_MESSAGE.getText());
            Menu.startMenu();
        } else {
            System.out.println(Message.LOSE_MESSAGE.getText());
            System.out.println(gameStats.getWordToGuess());
            Menu.startMenu();
        }
    }
}
