import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayrollBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter hourly pay rate: ");
            double rate = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(dataIn.readLine());

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

            System.out.printf("Gross Pay: Php %.2f%n", grossPay);
            System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
            System.out.printf("Net Pay: Php %.2f%n", netPay);

        } catch (IOException e) {
            System.err.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}