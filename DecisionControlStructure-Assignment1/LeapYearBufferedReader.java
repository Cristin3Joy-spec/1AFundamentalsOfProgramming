import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeapYearBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a year: ");
            int year = Integer.parseInt(dataIn.readLine());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (IOException e) {
            System.err.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}