import java.util.Scanner;

public class labquiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your old salary: ");
        double oldSalary = input.nextDouble();

        double increase = oldSalary * 0.1775;
        double newSalary = oldSalary + increase;
        double retroactivePay = increase * 2;

        System.out.println("New Salary: " + newSalary);
        System.out.println("Retroactive Pay: " + retroactivePay);
    }
}