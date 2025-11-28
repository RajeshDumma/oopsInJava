package levelOneTasks;

import java.util.Scanner;
import java.util.Arrays;

public class StudentReportCard {

    private String name;
    private final int id;
    private int[] marks ;

    public StudentReportCard(String stdName, int stdId, int[] marks){
        name = stdName;
        id = stdId;
        this.marks = marks;
    }

    public int calculateTotal(){
        int sum = 0;
        for(int m : marks){
            sum += m;
        }
        return sum;
    }
    public double averageMarks(){
      return (double) calculateTotal() / marks.length;
    }
    public char grade(){
        int total = calculateTotal();
        double average = (double) total / marks.length;

        if(average >= 90) return 'A';
        else if(average >= 70) return 'B';
        else if(average >= 60) return 'C';
        else if(average >= 40) return 'D';
        else return 'F';

    }
    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println(calculateTotal());
        System.out.println(averageMarks());
        System.out.println(grade());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i = 0; i < size; i++){
            marks[i] = sc.nextInt();
        }
        StudentReportCard std = new StudentReportCard(name, id, marks);
        std.display();

         
        sc.close();
    }

}
