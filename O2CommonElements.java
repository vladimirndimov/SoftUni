package ArraysExercise;

import java.util.Scanner;

public class O2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String firstElements = scanner.nextLine();
        String secondElements = scanner.nextLine();

        String[] firstArray = firstElements.split(" ");
        String[] secondArray = secondElements.split(" ");


        for (int i = 0; i < firstArray.length; i++) {

            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i].equals(secondArray[j])) {
                    System.out.print(firstArray[i] + " ");
                }

            }
        }

        System.out.println();

    }
}
