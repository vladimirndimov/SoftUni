package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class O10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int targetsPoked = 0;

        double originalValue = n * 0.50;

        while (n >= m) {

            if (n == originalValue) {
                if (y > 0) {
                    n /= y;
                }


                if (m > n) {
                    break;
                }
            }

            n -= m;
            targetsPoked++;
        }

        System.out.println(n);
        System.out.println(targetsPoked);
    }
}
