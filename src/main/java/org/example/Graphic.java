package org.example;

/*
Класс Graphic
    константа HANGMAN_STAGES содержит изображения виселицы
    displayHangmanStage:
        Отображает состояние виселицы в зависимости от количества ошибок
 */

class Graphic {
    //графика
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
    //пока не готов, +- так и оставляю
    public void displayHangmanStage(int errorCount) {
        if (errorCount < 1 || errorCount > HANGMAN_STAGES.length) {
            Messages.errorCountMessage();
        }
        System.out.println(HANGMAN_STAGES[errorCount - 1]);
    }
}
