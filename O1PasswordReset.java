package FinalExam;

import java.util.Scanner;

public class O1PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String commands = scanner.nextLine();
        while (!commands.equals("Done")) {
            String[] tokens = commands.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "TakeOdd":
                    StringBuilder current = new StringBuilder();
                    for (int i = 0; i < input.length(); i++) {
                        if (i % 2 == 1) {
                            current.append(input.charAt(i));
                        }
                    }
                    input = current.toString();
                    System.out.println(current);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String firstPart = input.substring(0, index);
                    String secondPart = input.substring(index + length);

                    input = firstPart + secondPart;
                    System.out.println(input);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    if (input.contains(substring)) {
                        input = input.replaceAll(substring, substitute);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            commands = scanner.nextLine();
        }

        System.out.println("Your password is: " + input);
    }
}
