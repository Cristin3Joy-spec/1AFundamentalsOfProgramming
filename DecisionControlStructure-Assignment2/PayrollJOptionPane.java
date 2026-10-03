import javax.swing.JOptionPane;

public class PayrollJOptionPane {
    public static void main(String[] args) {
        String rateInput = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double rate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog("Enter hours worked: ");
        double hours = Double.parseDouble(hoursInput);

        double grossPay = rate * hours;
        double withholdingPercent;

        if (grossPay <= 2000.00) {
            withholdingPercent = 0.10;
        } else if (grossPay <= 4000.00) {
            withholdingPercent = 0.12;
        } else if (grossPay <= 10000.00) {
            withholdingPercent = 0.15;
        } else {
            withholdingPercent = 0.20;
        }

        double withholdingTax = grossPay * withholdingPercent;
        double netPay = grossPay - withholdingTax;

        String result = String.format(
            "Gross Pay: Php %.2f\nWithholding Tax: Php %.2f\nNet Pay: Php %.2f",
            grossPay, withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, result);
    }
}