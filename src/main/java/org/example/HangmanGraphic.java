package org.example;

class HangmanGraphic {
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
        System.out.println(HANGMAN_STAGES[Math.min(errorCount, HANGMAN_STAGES.length - 1)]);
    }
}
