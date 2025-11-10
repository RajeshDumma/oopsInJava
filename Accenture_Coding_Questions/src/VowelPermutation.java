import java.util.Scanner;

public class VowelPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(permutationCount(str));
    }
    public static int permutationCount(String s){
        int vowelCount = 0;
        int consonentCount = 0;
        String vowles = "AEIOUaeiou";

        for(char ch : s.toCharArray()){
            if(vowles.indexOf(ch) >= 0){
                vowelCount++;
            }
            else if(Character.isLetter(ch)){
                consonentCount++;
            }
        }
        if(consonentCount == 0) return 0;

        return factorial(consonentCount);
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact *= i;
        }
        return fact;
    }
}
