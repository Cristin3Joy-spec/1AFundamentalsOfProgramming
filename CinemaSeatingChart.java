
import java.util.Arrays; // Ini-import natin ang Arrays para magamit yung deepToString() sa pag-print ng buong array.

public class Main { // Dito natin ginagawa yung Main class kung saan nakalagay ang program natin.

    public static void main(String[] args) { // Ito yung main method kung saan magsisimulang tumakbo ang program.

        String[][] seats = { // Gumagawa tayo ng 2D array na ang pangalan ay seats, na may rows at columns.
            {"Alice", "Bob", "Charlie"}, // Ito yung mga pangalan na nakaupo sa first row.
            {"David", "Emma", "Frank"} // Ito naman yung mga pangalan na nakaupo sa second row.
        }; // Dito nagtatapos yung paglalagay ng mga pangalan sa array.

        System.out.println("Person sitting in second row, third column: " + seats[1][2]); // Kinukuha at pini-print natin si Frank dahil nasa second row at third column siya.

        seats[0][1] = "Vacant"; // Pinapalitan natin si Bob ng Vacant dahil nasa first row at second column siya.

        System.out.println(Arrays.deepToString(seats)); // Dito naman, ipinapakita natin yung buong updated seating arrangement sa isang line gamit ang deepToString().

    } // Dito nagtatapos yung main method natin.

} // Dito nagtatapos yung Main class.
