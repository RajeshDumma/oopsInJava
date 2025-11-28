package levelOneTasks;

public class Employee {
    private  final String name;
    private  final int id;
    private double salary;

    public Employee(String empName, int empId, double empSalary){
        name = empName;
        id = empId;
        salary = empSalary;
    }

    public double calculateHRA(){
        return salary * 0.10; // 10%
    }
    public double calculateDA(){
        return salary * 0.07; // 7%
    }
    public double calculateTotalSalary(){
        return salary + calculateHRA() + calculateDA();
    }

    public  void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("-----------------------------------------");
    }
    public static void main(String[] args){
        Employee em = new Employee("rajesh", 136004, 21001);
        em.display();
    }

}
