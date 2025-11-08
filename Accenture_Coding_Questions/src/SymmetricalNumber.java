import java.util.Scanner;
public class SymmetricalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(makeSymmetric(n));
    }
    public static int makeSymmetric(int n){
        int symmetric = 1;
        while(symmetric <= n){
            symmetric = symmetric << 1 | 1;
        }
        return symmetric - n;
    }
}
