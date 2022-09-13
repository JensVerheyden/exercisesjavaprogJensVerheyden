import java.util.Scanner;

public class LanguageApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language code");

        String userInput = sc.nextLine();

        switch (userInput.toUpperCase()) {
            case "NL": System.out.println("Goeiedag!"); break;
            case "FR": System.out.println("Bonjour"); break;
            case "EN": System.out.println("Good day"); break;
            default: System.out.println("Goeiedag, bonjour and good day");
        }
    }
}
