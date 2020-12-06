package com.FirsStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double amount = dogs * 2.50 + animals * 4;
        System.out.printf("%.1f lv.", amount);
    }
}
