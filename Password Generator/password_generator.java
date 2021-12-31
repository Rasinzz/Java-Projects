import java.util.Random;
import java.util.Scanner;

public class password_generator {
    public static void main(String[] args) {
        Random rand = new Random();

        try (Scanner input = new Scanner(System.in)) {
            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
            String password = "";

            while (true) {
                System.out.println("Enter password count: ");
                int password_count = input.nextInt();

                System.out.println("Enter password length: ");
                int password_length = input.nextInt();

                for (int i = 0; i < password_count; i++) {
                    password = "";

                    for (int k = 0; k < password_length; k++) {
                        password += characters.charAt(rand.nextInt(72));
                    }

                    System.out.println("Your password is: " + password);
                }
            }
        }
    }
}