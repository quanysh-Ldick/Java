import java.util.Scanner;

public class StringTasks12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Task 1:");
        countVowelsAndConsonants(input);

        System.out.println("\nTask 2:");
        removeSpaces(input);

        System.out.println("\nTask 3:");
        findLongestWord(input);

        System.out.println("\nTask 4:");
        countCharsWithoutSpaces(input);

        System.out.println("\nTask 5:");
        System.out.println("Starts with 'Hello'? " + startsWithWord(input, "Hello"));

        System.out.println("\nTask 6:");
        System.out.println("Ends with '!'? " + endsWithChar(input, "!"));

        System.out.println("\nTask 7:");
        reverseString(input);

        System.out.println("\nTask 8:");
        removeDigits(input);

        System.out.println("\nTask 9:");
        replaceVowels(input);

        System.out.println("\nTask 10:");
        System.out.println("Is only digits? " + isOnlyDigits(input));
    }

    // Task 1
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouәіоуыюяеё".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Task 2
    public static void removeSpaces(String str) {
        String result = str.replace(" ", "");
        System.out.println("Without spaces: " + result);
    }

    // Task 3
    public static void findLongestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }

    // Task 4
    public static void countCharsWithoutSpaces(String str) {
        String noSpaces = str.replace(" ", "");
        System.out.println("Characters without spaces: " + noSpaces.length());
    }

    // Task 5
    public static boolean startsWithWord(String str, String word) {
        return str.startsWith(word);
    }

    // Task 6
    public static boolean endsWithChar(String str, String ch) {
        return str.endsWith(ch);
    }

    // Task 7
    public static void reverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }

    // Task 8
    public static void removeDigits(String str) {
        String result = str.replaceAll("\\d", "");
        System.out.println("Without digits: " + result);
    }

    // Task 9
    public static void replaceVowels(String str) {
        String result = str.replaceAll("(?i)[aeiouәіоуыюяеё]", "*");
        System.out.println("Vowels replaced: " + result);
    }

    // Task 10
    public static boolean isOnlyDigits(String str) {
        return str.matches("\\d+");
    }
}