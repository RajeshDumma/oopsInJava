import java.util.Scanner;

public class PoetAndRhymes {

    // Function to find the word with the longest rhyming suffix
    public static String findBestRhymingWord(String str, String[] arr) {
        String bestMatch = "No word";
        int maxMatchLength = 0;

        for (String word : arr) {
            if (word.equals(str)) {
                continue; // skip the same word
            }

            int matchLength = getMatchingSuffixLength(str, word);
            if (matchLength > maxMatchLength) {
                maxMatchLength = matchLength;
                bestMatch = word;
            }
        }

        return bestMatch;
    }

    // Function to calculate matching suffix length between two words
    public static int getMatchingSuffixLength(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int matchLength = 0;

        while (matchLength < len1 && matchLength < len2 &&
                s1.charAt(len1 - 1 - matchLength) == s2.charAt(len2 - 1 - matchLength)) {
            matchLength++;
        }

        return matchLength; // return the matching suffix length
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: word to rhyme with
        System.out.print("Enter the word: ");
        String str = sc.next();

        // Input: number of words in dictionary
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        // Input: dictionary words
        String[] dictionary = new String[n];
        System.out.println("Enter words in dictionary:");
        for (int i = 0; i < n; i++) {
            dictionary[i] = sc.nextLine();
        }

        // Find and print the best rhyming word
        String result = findBestRhymingWord(str, dictionary);
        System.out.println("Best rhyming word: " + result);

        sc.close();
    }
}
