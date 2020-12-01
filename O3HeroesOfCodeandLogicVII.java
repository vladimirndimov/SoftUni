package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class O3HeroesOfCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] heroes = scanner.nextLine().split("\\s+");
            String name = heroes[0];
            int hp = Integer.parseInt(heroes[1]);
            int mp = Integer.parseInt(heroes[2]);

            if (!heroesHP.containsKey(name) && !heroesMP.containsKey(name)) {
                heroesHP.put(name, hp);
                heroesMP.put(name, mp);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String action = tokens[0];
            String heroName = tokens[1];

            switch (action) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    if (heroesMP.get(heroName) >= mpNeeded) {
                        int manaPointsLeft = heroesMP.get(heroName) - mpNeeded;
                        heroesMP.put(heroName, manaPointsLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",heroName, spellName, manaPointsLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n",heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    if (heroesHP.get(heroName) > damage) {
                        int hpLeft = heroesHP.get(heroName) - damage;
                        heroesHP.put(heroName, hpLeft);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, hpLeft);
                    } else {
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(tokens[2]);
                    int currentMP = heroesMP.get(heroName);
                    if ((currentMP + amount) > 200) {
                        heroesMP.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!\n", heroName, (200 - currentMP));
                    } else {
                        heroesMP.put(heroName, (currentMP + amount));
                        System.out.printf("%s recharged for %d MP!\n", heroName, amount);
                    }
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(tokens[2]);
                    int currentHP = heroesHP.get(heroName);
                    if ((currentHP + healAmount) > 100) {
                        heroesHP.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!\n", heroName, (100 - currentHP));
                    } else {
                        heroesHP.put(heroName, (currentHP + healAmount));
                        System.out.printf("%s healed for %d HP!\n", heroName, healAmount);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        heroesHP.entrySet()
                .stream()
                .sorted((a,b) -> {
                    int res = b.getValue().compareTo(a.getValue());
                    if (res == 0) {
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(s -> System.out.println(String.format("%s\n  HP: %d\n  MP: %d",
                        s.getKey(), s.getValue(), heroesMP.get(s.getKey()))));
    }
}
