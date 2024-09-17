package org.example;

class HangmanGraphic {
    private static final String[] HANGMAN_STAGES = {
                    "  \\\n" +
                    "\n" +
                    "\n" +
                    "\n",

                    "  \\\n" +
                    "   ☻\n" +
                    "\n" +
                    "\n",

                    "  \\\n" +
                    "  ☻\n" +
                    "/\n" +
                    "\n",

                    "  \\\n" +
                    "  ☻\n" +
                    "/ ▲\n" +
                    "\n",

                    "  \\\n" +
                    "  ☻\n" +
                    "/ ▲ \\\n" +
                    "\n",

                    "  \\\n" +
                    "  ☻\n" +
                    "/ ▲ \\\n" +
                    " |\n",

                    "  \\\n" +
                    "  ☻\n" +
                    "/ ▲ \\\n" +
                    " | |\n"
    };

    public void displayHangmanStage(int errorCount) {
        if (errorCount < 0 || errorCount >= HANGMAN_STAGES.length) {
            System.out.println(Message.LOSE_MESSAGE.getText());
        } else {
            System.out.println(HANGMAN_STAGES[errorCount]);
        }
    }
}
