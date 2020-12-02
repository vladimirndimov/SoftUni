package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class O11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int snowMax = 0;
        int timeMax = 0;
        int qualityMax = 0;

        long snowballValue = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int sum = snowballSnow / snowballTime;
            long finalSum = (long) Math.pow(sum, snowballQuality);

            if (finalSum > snowballValue) {
                snowballValue = finalSum;
                snowMax = snowballSnow;
                timeMax = snowballTime;
                qualityMax = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", snowMax, timeMax, snowballValue, qualityMax);

    }
}
