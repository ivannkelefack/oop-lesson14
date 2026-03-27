package oop.exercice6;

import java.util.Scanner;

public class TextProcessor {

    public String processText() {
        Scanner scanner = new Scanner(System.in);

        // StringBuilder to build the final summary
        StringBuilder summary = new StringBuilder();

        int lineNumber = 1;

        System.out.println("Enter lines of text. Type END to stop.");

        // We keep reading lines until the user types END
        while (true) {
            System.out.print("Line " + lineNumber + ": ");
            String line = scanner.nextLine();

            // We stop the loop when the user types END
            if (line.equals("END")) {
                break;
            }

            // We process each line and append the result to the summary
            int words = countWords(line);
            int vowels = countVowels(line);
            String reversed = reverseLine(line);

            summary.append("--- Line ").append(lineNumber).append(" ---\n");
            summary.append("Original : ").append(line).append("\n");
            summary.append("Reversed : ").append(reversed).append("\n");
            summary.append("Words    : ").append(words).append("\n");
            summary.append("Vowels   : ").append(vowels).append("\n");
            summary.append("\n");

            lineNumber++;
        }

        return summary.toString();
    }

    // Count words manually using charAt()
    private int countWords(String line) {
        int wordCount = 0;
        boolean inWord = false;

        // We walk through each character one by one
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c != ' ' && !inWord) {
                // We just entered a new word
                wordCount++;
                inWord = true;
            } else if (c == ' ') {
                // We just left a word
                inWord = false;
            }
        }

        return wordCount;
    }

    // Count vowels by checking each character against a,e,i,o,u (upper and lower)
    private int countVowels(String line) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        // We walk through each character and check if it is a vowel
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            // We check if the character exists in the vowels string
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    // Reverse the line using StringBuilder only
    private String reverseLine(String line) {
        // StringBuilder has a built-in reverse() method
        return new StringBuilder(line).reverse().toString();
    }
}