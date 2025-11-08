import java.util.Scanner;
public class ConcertSeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxFansSeated(n,arr));
    }
  public static int maxFansSeated(int n , int[] arr){
        int maxFans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) maxFans++;
        }
        return maxFans;
  }
}
