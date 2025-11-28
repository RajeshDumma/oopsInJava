package levelOneTasks;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }
    public double perimeter(){
        return  2 * (length + width);
    }
    public void displayDetails(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 5);
        r1.displayDetails();
        Rectangle r2 = new Rectangle(10, 4);
        r2.displayDetails();

        Rectangle r3 = new Rectangle(7.5, 3.2);
        r3.displayDetails();
    }
}
