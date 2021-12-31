import java.util.Scanner;
import java.lang.Thread;

public class countdown_timer {
    public static void main(String[] args) throws InterruptedException {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter timer count: ");
            int count = input.nextInt();

            while (count != 0) {
                System.out.println(count);
                count -= 1;
                Thread.sleep(1000);
            }

            if (count == 0) {
                System.out.println("Timer Done!");
            }
        }
    }
}