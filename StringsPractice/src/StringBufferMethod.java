import java.util.*;
public class StringBufferMethod {
    public static void main(String[] args){
        String str  = "Rajesh";
        StringBuffer s = new StringBuffer(str);
        s.append(" Yadau  ");
        System.out.println(s);
        String trimmed = s.toString().trim();
        System.out.println(s);
        s.deleteCharAt(6);
        System.out.println(s);


    }
}
