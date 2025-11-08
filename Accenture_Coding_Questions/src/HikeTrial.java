import java.util.*;
public class HikeTrial {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i = 0;i < n; i++){
         arr[i] = sc.nextInt();
     }
     System.out.println(peakElement(n, arr));
    }
 public static int peakElement(int n, int[] arr) {
     if (n == 1) return arr[0];
     if (arr[0] >= arr[1]) return arr[0];
     for (int i = 1; i < n - 1; i++) {
         if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
             return arr[i];
         }
     }
     return 0;
 }
}
