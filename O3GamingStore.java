package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class O3GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double ownMoney = currentBalance;
        double money = 0;

        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    if (ownMoney < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money += 39.99;
                        ownMoney -= 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (ownMoney < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money += 15.99;
                        ownMoney -= 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (ownMoney < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money += 19.99;
                        ownMoney -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (ownMoney < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money += 59.99;
                        ownMoney -= 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (ownMoney < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money += 29.99;
                        ownMoney -= 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (ownMoney < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money += 39.99;
                        ownMoney -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            input = scanner.nextLine();
        }

        if (money < currentBalance) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", money, currentBalance - money);
        } else {
            System.out.println("Out of money!");
        }


    }
}
