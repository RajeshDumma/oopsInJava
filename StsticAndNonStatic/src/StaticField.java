public class StaticField {
    static int number;

    static{
        System.out.println("Static block1");
    }
    static{
        System.out.println("Static block2");
    }
    {
        System.out.println("Non Static block");
    }
    {
        System.out.println("Non Static block1");
    }

    public StaticField(){
        System.out.println("parameterLess Constructor");
    }
    public StaticField(int i){
        number = i;
        System.out.println("parameterized constructor");
    }

    public static void main(String[] args){
        System.out.println("Main mathod");
        StaticField test0 = new StaticField();
        StaticField test = new StaticField(40);
        System.out.println("obj1 " + number);
        StaticField test1 = new StaticField(60);
        System.out.println("obj2 " + number);
        StaticField test2 = new StaticField(100);
        System.out.println("obj2 " + number);

    }
}
