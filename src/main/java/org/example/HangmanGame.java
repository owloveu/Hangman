package org.example;
//TODO сделать цикл для
public class HangmanGame {

    private final GameStats gameStats;
    private final WordHandler wordHandler;
    private final HangmanGraphic hangmanGraphic;

    public HangmanGame() {
        this.wordHandler = new WordHandler();
        String wordToGuess = wordHandler.getRandomWord();  // Получаем случайное слово
        this.gameStats = new GameStats(wordToGuess);
        this.hangmanGraphic = new HangmanGraphic();
    }

    public void startGame() {
        System.out.println(Message.WORD_TO_GUESS.getText());
        wordHandler.printMaskedWord();
        while (!gameStats.isGameOver()) {
            char guessedLetter = GameStats.userLetter();  // Получаем букву от пользователя
            gameStats.makeGuess(guessedLetter);  // Обрабатываем попытку
            hangmanGraphic.displayHangmanStage(gameStats.getErrorCount());  // Отображаем текущее состояние виселицы
            System.out.println(gameStats.getCurrentGuess());  // Выводим текущее состояние слова
        }
        if (gameStats.isWordGuessed()) {
            System.out.println(Message.WIN_MESSAGE.getText());
        } else {
            System.out.println(Message.LOSE_MESSAGE.getText());
            System.out.println(gameStats.getWordToGuess());
        }
    }
}
