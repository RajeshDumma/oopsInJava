import java.util.*;
public class StringPractice{
    public static void main(String[] args){
        String str = "Rajesh";
        String str2 = "Rajesh";
        String str3 = new String("rajesh");
        System.out.println(str == str2);
       // str = "dumma";
        System.out.println(str == str2);
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str3));

        StringBuilder str4 = new StringBuilder(str);
         str4.append("dumma");
         str4.setCharAt(4,'g');
         System.out.println(str4);
         str4.deleteCharAt(4);
        System.out.println(str4);
         str4.replace(4,5 ,"s");
        System.out.println(str4);
        str4.setCharAt(5, 'h');
        System.out.println(str4);
        str4.delete(6 , 10);
        System.out.println(str4);
        str4.insert(6, "Yadau");
        System.out.println(str4);


    }
}