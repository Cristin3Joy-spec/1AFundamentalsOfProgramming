import java.util.Scanner;

public class PayrollScanner {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = inputDevice.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = inputDevice.nextDouble();

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
    }
}