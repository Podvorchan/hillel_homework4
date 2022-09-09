package ua.ithillel.podvorchan.homework;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        play();

    }

    static void play() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        char[] cell = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int x = random.nextInt(24);
        String word = words[x];
        String str;

        System.out.println("The computer guessed the word. Guess him.");

        do {
            str = scanner.nextLine();
            for (int i = 0; i < str.length() && i < word.length(); i++) {
                if (str.charAt(i) == word.charAt(i)) {
                    cell[i] = str.charAt(i);
                }
            }
            System.out.println(cell);
            if (str.equals(word)) {
                System.out.println("Right! Replay the game again? (1-yes, 2-no)");
                int a = scanner1.nextInt();
                if (a == 1) {

                    play();
                } else {
                    System.out.println("Goodbye");
                    break;
                }
            }
        }
        while (str != word);
    }
}

