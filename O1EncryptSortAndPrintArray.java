package ArraysMoreExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class O1EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        // a e i o u A E I O U

        for (int i = 0; i < n; i++) {

            String names = scanner.nextLine();
            char[] letters = names.toCharArray();
            int consonantSum = 0;
            int vowelSum = 0;

            for (int j = 0; j < letters.length; j++) {

                char lett = Array.getChar(letters, j);

                if (lett == 'a'|| lett == 'e'|| lett == 'i'|| lett == 'o'|| lett == 'u'
                        || lett == 'A'|| lett == 'E'|| lett == 'I' || lett == 'O'|| lett == 'U') {
                    vowelSum += (int) lett * letters.length;
                } else {
                    consonantSum += (int) lett / letters.length;
                }

            }

            numbers[i] = consonantSum + vowelSum;

        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
