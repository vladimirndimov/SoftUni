package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class O1IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int sum = firstNum + secondNum;
        int division = sum / thirdNum;
        int multiplayer = division * fourthNum;

        System.out.println(multiplayer);
    }
}
