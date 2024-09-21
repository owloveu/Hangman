package org.example;

//TODO дополнить список сообщений по необходимости
public enum Message {

    FILE_IS_EMPTY("Файл пустой, проверьте путь к файлу"),
    START_MENU("\n 1.Новая игра \n 2. Выход\n"),
    EXIT("\nВсё, пиздуй-бороздуй, и я попиздил, нахуй."),
    GREETING("\nЙо-йо-йо 1-4-8-3 да 3-6-9, Альбукерке жжёт, чё-кого, суч*ра, жди сигнала\u2060\u2060"),
    ENTER_LETTER("\nПожалуйста, введите букву: "),
    INVALID_INPUT ("\nНекорректный ввод. Попробуйте снова."),
    WIN_MESSAGE ("\nПоздравляем! Вы выиграли!"),
    LOSE_MESSAGE ("\nВы проиграли. Слово было: "),
    START_NEW_GAME ("Начинаем новую игру!"),
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
