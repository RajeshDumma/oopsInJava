package classAndObjects;

public class Details {
    public String name;
   private int age;
    String address;
    void setAge(int age){
        this.age=age;
    }

    public void shows() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

}
