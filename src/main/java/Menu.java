public class Menu {

    private final UserInput userInput = new UserInput();
    private final static String NEW_GAME = "1";
    private final static String EXIT_GAME = "2";

    public void startMenu() {
        boolean running = true;
        while (running) {
            System.out.println(Message.START_MENU.getText());
            String input = userInput.getUserInput();

            switch (input) {
                case NEW_GAME -> newGame();
                case EXIT_GAME -> {
                    exit();
                    running = false;
                }
                default -> System.out.println(Message.INVALID_INPUT.getText());
            }
        }
    }

    private void exit() {
        System.out.println(Message.EXIT.getText());
    }

    private void newGame(){
        System.out.println(Message.START_NEW_GAME.getText());
        WordHandler wordHandler = new WordHandler();
        GameStats gameStats = new GameStats(wordHandler);
        HangmanGraphic hangmanGraphic = new HangmanGraphic();
        HangmanGame game = new HangmanGame(gameStats, hangmanGraphic, userInput);
        game.startGame();
    }
}