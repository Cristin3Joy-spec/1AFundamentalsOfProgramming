
import java.util.Scanner;

public class MuchoDineroScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 20000.00;
        double amount;

        do {
            System.out.print("Enter amount (0 to stop): ");
            amount = input.nextDouble();

            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful!");
            } 
            else if (amount < 0) {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                    System.out.println("Withdrawal successful!");
                } 
                else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            if (amount != 0) {
                System.out.printf("Outstanding Balance: P%.2f%n", balance);
            }

        } while (amount != 0);

        System.out.println("Transaction ended.");
        input.close();
    }
}
