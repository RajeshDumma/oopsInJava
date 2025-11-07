public class StringsTest {
    public static void main(String[] args) {
        String str = "raju";
        str = str.replace('u', 'a');  // replaces 'u' with 'a'
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("r"));
        System.out.println(str.startsWith("ra"));
        System.out.println(str.indexOf("a"));      // first occurrence
        System.out.println(str.lastIndexOf("a"));  // last occurrence


    }
}
