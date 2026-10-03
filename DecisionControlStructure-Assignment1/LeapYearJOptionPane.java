import javax.swing.JOptionPane;

public class LeapYearJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a year: ");
        int year = Integer.parseInt(input);

        String result;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            result = year + " is a Leap Year.";
        } else {
            result = year + " is NOT a Leap Year.";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}