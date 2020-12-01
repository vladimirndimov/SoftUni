package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O2FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String regex = "^(@#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)$";
            String barcode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                String digitsRegex = "\\d";
                Pattern digitsPattern = Pattern.compile(digitsRegex);
                Matcher digitsMatcher = digitsPattern.matcher(barcode);
                System.out.print("Product group: ");
                if (digitsMatcher.find()) {
                    System.out.print(digitsMatcher.group());
                    while (digitsMatcher.find()) {
                        System.out.print(digitsMatcher.group());
                    }
                } else {
                    System.out.print("00");
                }
                System.out.println();
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
