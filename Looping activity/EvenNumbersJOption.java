
import javax.swing.JOptionPane;

public class EvenNumbersJOption {
    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();

        for (int i = 2; i <= 100; i += 2) {
            output.append(i).append(" ");

            if (i % 20 == 0) {
                output.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
