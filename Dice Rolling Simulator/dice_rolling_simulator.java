import java.util.Random;
import java.util.Scanner;

public class dice_rolling_simulator {
    public static void main(String[] args) {
        Random rand = new Random();

        try(Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter username: ");
                String choice = input.nextLine();

                if (choice.equals("yes")) {
                    System.out.println("Rolled: " + rand.nextInt(1, 11));
                } else if (choice.equals("no")) {
                    break;
                } else {
                    System.out.println("Invalid input (must be 'yes' or 'no')");
                }
            }
        }
    }
}