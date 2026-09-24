import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class seventhJava {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.print("Please enter your name: ");
        try {
            name = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        String msg = "Hello, " + name + "!";
        System.out.println(msg);
    }
}