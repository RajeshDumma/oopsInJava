
package levelOneTasks;

public class Student {
  private String name;
  private int roll;
   private int marks;

    public Student(String name, int roll, int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

    public void calculateGrade(){
        if(marks >= 85) System.out.println("A Grade");
        else if(marks >=75) System.out.println("B Grade");
        else if(marks >= 55) System.out.println("C Grade");
        else if(marks >= 40) System.out.println("D Grade");
        else System.out.println("F Grade");
    }

    public static void main(String[] args) {
        Student std = new Student("Rajesh", 23, 40);
        std.display();
        std.calculateGrade();
        Student std2 = new Student("vamshi", 25, 75);
        std2.display();
        std2.calculateGrade();
        Student std3 = new Student("Sai lahari", 30, 95);
        std3.display();
        std3.calculateGrade();

    }
}
