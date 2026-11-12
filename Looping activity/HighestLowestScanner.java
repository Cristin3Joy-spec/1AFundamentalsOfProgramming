
import java.util.Scanner;

public class HighestLowestScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number, highest, lowest;

        System.out.print("Enter number 1: ");
        number = input.nextDouble();

        highest = number;
        lowest = number;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextDouble();

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);

        input.close();
    }
}
