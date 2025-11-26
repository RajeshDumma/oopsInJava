import java.util.*;
public class PrimeNumberPicnic {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(primeNumberPicnic(n));
    }
    public static int primeNumberPicnic(int n){
        if(n <= 1) return 0;
        int sum = 0;
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) sum +=i;
        }
        return sum;
    }
}
