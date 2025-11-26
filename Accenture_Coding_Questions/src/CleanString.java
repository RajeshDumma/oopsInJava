import java.util.*;
public class CleanString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase();
        String b = sc.next().toUpperCase();
  System.out.println(removeCharacters(a,b));
    }
    public static String removeCharacters(String a, String b){

        String result= "";
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            boolean isFound = false;
            for(int j = 0; j < b.length();j++){
                if(ch == b.charAt(j)){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                result += ch;
            }
        }
        if(result.length() == 0) return "Empty";
        else return result;
    }
}
