import java.util.Scanner;

public class GreetApplication {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome");
            System.out.println("Would you like to be greeted again? Y/N");
            Scanner sc = new Scanner(System.in);

            String userInput = sc.nextLine();

            if (userInput.equals("N")) {
                break;
            }

        }
    }
}
