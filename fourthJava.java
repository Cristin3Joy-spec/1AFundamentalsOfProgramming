import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthJava {

    public static void main(String[] args) {

        String filePath = "output.txt";

        try (BufferedWriter writer =
             new BufferedWriter(new FileWriter(filePath))) {

            writer.write("This is the first line of text.");

        } catch (IOException e) {
            e.printStackTrace();
    }
}
	}