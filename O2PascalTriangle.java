package ArraysMoreExercise;

import java.util.Scanner;

public class O2PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r, i, k, number = 1, j;

        r = scanner.nextInt();

        for (i = 0; i < r; i++) {
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
