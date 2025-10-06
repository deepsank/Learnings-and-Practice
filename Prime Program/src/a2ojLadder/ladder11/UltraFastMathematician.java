package a2ojLadder.ladder11;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        // Initialize Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Read the two binary strings
        String str1 = scanner.nextLine().trim();
        String str2 = scanner.nextLine().trim();

        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Loop through each character in both strings
        for (int i = 0; i < str1.length(); i++) {
            // Compare the characters at the same position in both strings
            if (str1.charAt(i) != str2.charAt(i)) {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        // Output the result as a string
        System.out.println(result.toString());

        // Close the scanner
        scanner.close();
    }
}

