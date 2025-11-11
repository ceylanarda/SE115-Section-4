import java.util.Random;
public class scn3 {
    public static void main(String[] args) {
        int amountOfForecasts = 1000000;
        String[] weatherTypes = {"Sunny", "Cloudy", "Rainy", "Stormy"};
        int[] weatherCounts = new int[4];
        int[] weatherChanceArray = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
        Random rnd = new Random();
        for (int i = 0; i < amountOfForecasts; i++) {
            int randomPick = rnd.nextInt(weatherChanceArray.length);
            int categoryIndex = weatherChanceArray[randomPick];
            weatherCounts[categoryIndex]++;
        }
        for (int i = 0; i < weatherCounts.length; i++) {
            double percentage = 100.0 * weatherCounts[i] / amountOfForecasts;
            System.out.printf("%-7s: %,10d (%.2f%%)%n", weatherTypes[i], weatherCounts[i], percentage);
        }
    }
}