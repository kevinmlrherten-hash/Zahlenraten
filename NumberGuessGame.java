import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(200) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("=== Zahlenraten ===");
        System.out.println("Ich habe eine Zahl zwischen 1 und 200 gewählt.");

        while (guess != secretNumber) {

            System.out.print("Dein Tipp: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Zu klein!");
            } else if (guess > secretNumber) {
                System.out.println("Zu groß!");
            } else {
                System.out.println("Richtig!");
                System.out.println("Du hast " + attempts + " Versuche gebraucht.");
            }
        }

        scanner.close();
    }
}