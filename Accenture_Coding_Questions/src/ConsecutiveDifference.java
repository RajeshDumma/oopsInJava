import java.util.Scanner;

public class ConsecutiveDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] =  sc.nextInt();
        }
        if (arr.length < 2) {
            System.out.println(arr[0]);
            return;
        }

        int[] diff = new int[arr.length-1];
        for(int i = 1; i < n; i++){
            diff[i] = arr[i] - arr[i-1];
        }
    }
}
