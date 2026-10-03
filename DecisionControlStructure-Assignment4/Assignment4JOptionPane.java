import javax.swing.JOptionPane;

public class Assignment4JOptionPane {
    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog("Enter height (cm): ");
        double height = Double.parseDouble(heightInput);

        String ageInput = JOptionPane.showInputDialog("Enter age: ");
        int age = Integer.parseInt(ageInput);

        String citizenship = JOptionPane.showInputDialog("Enter citizenship code (C/N): ");

        String recommendee = JOptionPane.showInputDialog("Enter recommendee code (R/N): ");

        String result;

        if (recommendee.equalsIgnoreCase("R")) {
            result = "Accepted";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase("C")) {
            result = "Accepted";
        } else {
            result = "Rejected";
        }

        JOptionPane.showMessageDialog(null, "Application Status: " + result);
    }
}