package classAndObjects;

public class Test {
    public static void main(String[] args) {
        Details person1 = new Details();
        person1.name = "Rajesh";
        person1.setAge(45);
        person1.address = "kurnool";
        person1.shows();

        Details person2 = new Details();
        person2.name = "Srinu";
        //person2.age = 22;
        person2.address = "kadapa";
        person2.shows();
    }
}
