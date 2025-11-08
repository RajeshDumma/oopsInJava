import java.util.*;
public class LowerCaseCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
       int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch) &&  ch !=' '){
                result = result + ch;
                count++;
            }
        }
        System.out.println(result + " "+count);
    }
}
