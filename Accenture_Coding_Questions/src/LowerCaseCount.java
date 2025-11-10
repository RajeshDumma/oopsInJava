import java.util.*;

public class LowerCaseCount {

    public static String findLowercaseLetters(String input) {
        StringBuilder lowercaseLetters = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowercaseLetters.append(ch);
            }
        }

        int count = lowercaseLetters.length();
        return lowercaseLetters + " " + count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findLowercaseLetters(str));
    }
}
