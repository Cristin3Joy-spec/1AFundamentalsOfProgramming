import java.util.Scanner;

public class labquiz2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Adobo Cooking Show");
        String name;
        double kilo;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = inputDevice.nextLine();
        System.out.print("How many kilo of pork will you cook? ");
        kilo = inputDevice.nextDouble();
        double soysauce = 0.5;
        double vinegar = 0.33;
        double result = kilo*soysauce;
        double result2 = kilo*vinegar;
        System.out.println("The ratio of soy sauce for " + kilo + "kg is = " + result + " cup/s.");
        System.out.println("The ratio of vinegar for " + kilo + "kg is = " + result2 + " cup/s.");
    }
}