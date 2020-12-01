package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class O3Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            String city = tokens[0];

            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (populationMap.containsKey(city)) {
                int newPopulation = populationMap.get(city) + population;
                int newGold = goldMap.get(city) + gold;
                populationMap.put(city, newPopulation);
                goldMap.put(city, newGold);
            } else {
                populationMap.put(city, population);
                goldMap.put(city, gold);
            }
            input = scanner.nextLine();
        }

        String data = scanner.nextLine();
        while (!data.equals("End")) {
            String[] tokens = data.split("=>");
            String command = tokens[0];
            String town = tokens[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(tokens[2]);
                    int gold = Integer.parseInt(tokens[3]);

                    int peopleLeft = populationMap.get(town) - people;
                    int goldLeft = goldMap.get(town) - gold;

                    if (peopleLeft <= 0 || goldLeft <= 0) {
                        populationMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);
                        System.out.printf("%s has been wiped off the map!\n", town);
                    } else {
                        populationMap.put(town, peopleLeft);
                        goldMap.put(town, goldLeft);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);
                    }
                    break;
                case "Prosper":
                    int goldToAdd = Integer.parseInt(tokens[2]);
                    int addedGold = goldMap.get(town) + goldToAdd;

                    if (goldToAdd < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        goldMap.put(town, addedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", goldToAdd, town, addedGold);
                    }
                    break;
            }
            data = scanner.nextLine();
        }

        if (goldMap.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", goldMap.size());
        }

        goldMap.entrySet()
                .stream()
                .sorted((l, r) -> {
                    int result = r.getValue().compareTo(l.getValue());
                    if (result == 0) {
                        result = l.getKey().compareTo(r.getKey());
                    }
                    return result;
                })
                .forEach(s -> System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg",
                        s.getKey(), populationMap.get(s.getKey()), s.getValue())));


    }
}
