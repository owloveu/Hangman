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
        if (errorCount < 1 || errorCount > HANGMAN_STAGES.length) {
            Message.showMessage("errorCount");
        }
        System.out.println(HANGMAN_STAGES[errorCount - 1]);
    }
}
