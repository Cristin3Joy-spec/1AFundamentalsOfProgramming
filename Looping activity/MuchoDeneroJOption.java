
import javax.swing.JOptionPane;

public class MuchoDineroJOption {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount;

        do {
            String input = JOptionPane.showInputDialog(
                "Current Balance: P" + String.format("%.2f", balance)
                + "\nEnter amount (0 to stop):"
            );

            if (input == null) {
                break;
            }

            amount = Double.parseDouble(input);

            if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null, "Deposit successful!");
            } 
            else if (amount < 0) {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                    JOptionPane.showMessageDialog(null, "Withdrawal successful!");
                } 
                else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }

            if (amount != 0) {
                JOptionPane.showMessageDialog(
                    null,
                    "Outstanding Balance: P" + String.format("%.2f", balance)
                );
            }

        } while (amount != 0);

        JOptionPane.showMessageDialog(null, "Transaction ended.");
    }
}
