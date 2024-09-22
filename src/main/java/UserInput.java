import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public char getUserLetter() {
        System.out.print(Message.REQUEST_LETTER.getText());
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.matches("[а-яё]")) {
                return input.charAt(0);
            }
            System.out.println(Message.INVALID_INPUT.getText());
        }
    }

    public String getUserInput() {
        return scanner.nextLine().trim();
    }
}