import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarshipBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter parents' monthly salary: ");
            double salary = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter entrance exam score: ");
            double entrance = Double.parseDouble(dataIn.readLine());

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

        } catch (IOException e) {
            System.err.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}