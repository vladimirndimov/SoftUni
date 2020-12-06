package com.FirsStepsInCodingLab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double inches = Double.parseDouble(input);
        double centimeters = inches * 2.54;

        System.out.println(centimeters);
    }
}
