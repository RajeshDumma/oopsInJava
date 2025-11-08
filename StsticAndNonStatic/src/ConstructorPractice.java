public class ConstructorPractice {
    int number;
    public ConstructorPractice(){
        System.out.println("Constructor1");
    }
    public ConstructorPractice(int a){
        this.number = a;
    }
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("non Static Block");

    }
    public static void main(String[] args){
        System.out.println("Main Method");
        ConstructorPractice cls = new ConstructorPractice(60);
         System.out.println(cls.number);
    }
}
