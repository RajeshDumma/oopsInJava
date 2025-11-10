import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        System.out.println(repeatedChar(str, ch));
    }
    public static int repeatedChar(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch) count++;
        }
        return count;
    }
}
