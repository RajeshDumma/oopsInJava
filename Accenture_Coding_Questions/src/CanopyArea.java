import java.util.Scanner;

public class CanopyArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        final double pi = 3.14;
        double area = pi * (r * r) ;
        int result ;
        if(area - Math.floor(area) == 0.5){
            result =(int) Math.floor(area);
        } else{
            result = (int) Math.round(area);
        }
        System.out.println(result);
    }
}
