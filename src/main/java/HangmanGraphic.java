public class HangmanGraphic {
    private static final String[] HANGMAN_STAGES = {
            "\n",

            "  \\\n",

            """
      \\
      ☻
    """,

            """
     \\
     ☻
    /
    """,

            """
      \\
      ☻
    / ▲
    """,

            """
      \\
      ☻
    / ▲ \\
   
    """,
            """
      \\
      ☻
    / ▲ \\
     |
    """,

            """
      \\
      ☻
    / ▲ \\
     | |
    """
    };

    public void displayHangmanStage(int errorCount) {
        int index = Math.min(errorCount, HANGMAN_STAGES.length - 1);
        System.out.println(HANGMAN_STAGES[index]);
    }
}
