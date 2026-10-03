import javax.swing.JOptionPane;

public class ScholarshipJOptionPane {
    public static void main(String[] args) {
        String nsatInput = JOptionPane.showInputDialog("Enter NSAT score: ");
        double nsat = Double.parseDouble(nsatInput);

        String salaryInput = JOptionPane.showInputDialog("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(salaryInput);

        String entranceInput = JOptionPane.showInputDialog("Enter entrance exam score: ");
        double entrance = Double.parseDouble(entranceInput);

        String result;
        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        } else {
            result = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, "Application Status: " + result);
    }
}import javax.swing.JOptionPane;

public class ScholarshipJOptionPane {
    public static void main(String[] args) {
        String nsatInput = JOptionPane.showInputDialog("Enter NSAT score: ");
        double nsat = Double.parseDouble(nsatInput);

        String salaryInput = JOptionPane.showInputDialog("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(salaryInput);

        String entranceInput = JOptionPane.showInputDialog("Enter entrance exam score: ");
        double entrance = Double.parseDouble(entranceInput);

        String result;
        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        } else {
            result = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, "Application Status: " + result);
    }
}