package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class O7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            sum += litters;

            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= litters;
            }
        }

        System.out.println(sum);
    }
}
