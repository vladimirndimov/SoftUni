package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class O3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = (int) Math.ceil((double) numberOfPeople / capacity);

        if (numberOfPeople <= capacity){
            fullCourses = 1;
        }

        System.out.println(fullCourses);
    }
}
