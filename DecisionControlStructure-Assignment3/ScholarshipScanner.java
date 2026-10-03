import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = inputDevice.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = inputDevice.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double entrance = inputDevice.nextDouble();

        String result;
        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        } else {
            result = "For Further Study";
        }

        System.out.println("Application Status: " + result);
    }
}