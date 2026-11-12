public class DailyTemperatureTracker { // ito yung class ng program ko, dito ko nilagay lahat ng code kasi sa Java kailangan laging nasa loob ng class ang lahat
    public static void main(String[] args) { // ito yung main method, dito talaga nagsisimulang tumakbo yung program kapag ni-run ko

        double[] temperatures = new double[5]; // gumawa ako ng array na ang pangalan ay temperatures, double yung type kasi may decimal yung temperature, tapos 5 lang ang kaya niyang paglagyan kasi 5 days lang

        temperatures[0] = 32.5; // nilagay ko yung 32.5 sa index 0, ito yung unang araw kasi sa Java, 0 ang simula ng bilang, hindi 1
        temperatures[1] = 34.0; // 34.0 naman yung para sa pangalawang araw, kaya index 1 ito
        temperatures[2] = 31.8; // 31.8 yung sa pangatlong araw, index 2 ito, tandaan ko ito kasi papalitan ko mamaya
        temperatures[3] = 33.2; // 33.2 yung sa pang-apat na araw, index 3
        temperatures[4] = 35.1; // 35.1 yung sa panglimang araw, index 4 ito, yung pinakahuling slot ng array kasi 5 lang ang laman

        for (int i = 0; i < temperatures.length; i++) { // gumamit ako ng for loop para hindi ko na isa-isahin yung pag-print, si i ay nagsisimula sa 0 tapos tataas ng 1 hanggang sa maging mas maliit pa siya sa temperatures.length, na 5 yung value, kaya hanggang index 4 lang siya aabot
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // piniprint ko dito yung araw at yung temperature niya, nilagyan ko ng + 1 yung i kasi kung hindi, "Day 0" ang lalabas sa unang araw, tapos temperatures[i] yung kumukuha ng value sa bawat index
        } // dito na nagtatapos yung loop, kapag nakaikot na siya sa lahat ng 5 elements

        temperatures[2] = 32.0; // dito ko pinalitan yung temperature ng pangatlong araw, kasi index 2 yun, yung dating 31.8 ay napalitan na ng 32.0, kasi pag nag-assign ka ulit sa parehong index, mapapalitan yung lumang value

        System.out.println("Updated Day 3: " + temperatures[2]); // piniprint ko ulit yung value sa index 2 para makita kong napalitan na talaga siya ng 32.0
    } // dulo ng main method
} // dulo ng class, tapos na ang program