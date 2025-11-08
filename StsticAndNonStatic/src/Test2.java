public class Test2 {
    public static void main(String[] args){
     //   System.out.println(Test.number2); // we can access directly for static variable
       // System.out.println(Test.number); // this non static variable we can't access directly
       // Test test = new Test();
       // System.out.println(test.number);
     //   Test.statement1();
       // Test st = new Test();
       // st.statement2();
        System.out.println("Main Method");
        new Test2();
    }
    // Blocks
    static {
        System.out.println("static Block");
    }
    {
        System.out.println("Non static Block");
    }
    public Test2(){
        System.out.println("Constructor");
    }
}
