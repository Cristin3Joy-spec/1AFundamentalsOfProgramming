
import javax.swing.JOptionPane;

public class HighestLowestJOption {
    public static void main(String[] args) {

        double number, highest, lowest;

        number = Double.parseDouble(
            JOptionPane.showInputDialog("Enter number 1:")
        );

        highest = number;
        lowest = number;

        for (int i = 2; i <= 10; i++) {
            number = Double.parseDouble(
                JOptionPane.showInputDialog("Enter number " + i + ":")
            );

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        JOptionPane.showMessageDialog(
            null,
            "Highest Number: " + highest +
            "\nLowest Number: " + lowest
        );
    }
}
