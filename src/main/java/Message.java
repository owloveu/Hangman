public enum Message {

    FILE_IS_EMPTY("Файл пустой, проверьте путь к файлу"),
    START_MENU("\n1. Новая игра \n2. Выход\n"),
    EXIT("\nВсё, пиздуй-бороздуй, и я попиздил, нахуй."),
    GREETING("\nЙо-йо-йо 1-4-8-3 да 3-6-9, Альбукерке жжёт, чё-кого, суч*ра, жди сигнала\u2060\u2060"),
    INVALID_INPUT ("\nНекорректный ввод. Попробуйте снова."),
    WIN_MESSAGE ("\nПоздравляем! Вы выиграли!"),
    LOSE_MESSAGE ("\nВы проиграли. Слово было: "),
    START_NEW_GAME ("\nНачинаем новую игру!"),
    REQUEST_LETTER ("Введите букву: "),
    GUESSED_LETTERS("\nЭти буквы уже были: "),
    WORD_TO_GUESS("Загаданное слово: ");

    private final String text;

    Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
