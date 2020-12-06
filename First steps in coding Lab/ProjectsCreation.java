package com.FirsStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = numberOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursNeeded,numberOfProjects);

    }
}
