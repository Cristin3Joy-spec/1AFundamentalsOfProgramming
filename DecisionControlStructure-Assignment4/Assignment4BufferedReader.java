import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4BufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter height (cm): ");
            double height = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter age: ");
            int age = Integer.parseInt(dataIn.readLine());

            System.out.print("Enter citizenship code (C/N): ");
            String citizenship = dataIn.readLine();

            System.out.print("Enter recommendee code (R/N): ");
            String recommendee = dataIn.readLine();

            String result;

            if (recommendee.equalsIgnoreCase("R")) {
                result = "Accepted";
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase("C")) {
                result = "Accepted";
            } else {
                result = "Rejected";
            }

            System.out.println("Application Status: " + result);

        } catch (IOException e) {
            System.err.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}