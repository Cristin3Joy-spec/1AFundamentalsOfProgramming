import java.util.Scanner;

public class JediScanner {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        double height = inputDevice.nextDouble();

        System.out.print("Enter age: ");
        int age = inputDevice.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = inputDevice.next();

        System.out.print("Enter recommendee code (R/N): ");
        String recommendee = inputDevice.next();

        String result;

        if (recommendee.equalsIgnoreCase("R")) {
            result = "Accepted";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase("C")) {
            result = "Accepted";
        } else {
            result = "Rejected";
        }

        System.out.println("Application Status: " + result);
    }
}