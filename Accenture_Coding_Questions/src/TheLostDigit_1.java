import java.util.Scanner;
public class TheLostDigit_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(n , arr));
    }

    public static int missingNumber(int n , int[] arr){
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += arr[i];
        }
        int expectedSum = n * (n+1)/2;
        return expectedSum - sum;
    }
}
