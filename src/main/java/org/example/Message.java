package org.example;

//TODO дополнить список сообщений по необходимости
public enum Message {

    FILE_IS_EMPTY("Файл пустой, проверьте путь к файлу"),
    START_MENU("\n 1.Новая игра \n 2. Выход\n"),
    EXIT("Всего хорошего!"),
    GREETING("Добро пожаловать в игру!"),
    ENTER_LETTER("Пожалуйста, введите букву: "),
    INVALID_INPUT ("Некорректный ввод. Попробуйте снова."),
    GAME_OVER ("Игра окончена!"),
    WIN_MESSAGE ("Поздравляем! Вы выиграли!"),
    LOSE_MESSAGE ("Вы проиграли. Слово было: "),
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
