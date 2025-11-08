
import java.util.*;
public class Test {
      int number;   // non static method
      static int number2;  // static method
    public static void main(String[] args){

         // creating objects for class and non static variables to access
        Test t1 = new Test();
        t1.number = new Random().nextInt(); // Random class it will givens the random number
        Test t2 = new Test();
        t2.number = new Random().nextInt();
        Test t3 = new Test();
        t3.number = new Random().nextInt();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // for age ; // this static variable stored in Method area
        Test.number2 = new Random().nextInt();
        Test.number2 = new Random().nextInt();
        Test.number2 = new Random().nextInt();
        System.out.println(Test.number2);
        System.out.println(Test.number2);
        System.out.println(Test.number2);

    }

    public static void statement1(){
        System.out.println("Static method");
    }
    public void statement2(){
        System.out.println("Non static method");
    }
}
