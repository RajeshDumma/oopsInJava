import java.util.*;
public class HalloweenCandies {

    public static int maxCandiesBobCanBuy(int n, int[] a, int m) {

        int candiesCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0) {
                candiesCount++;
            } else if (m >= a[i]) {
                m -= a[i];
                candiesCount++;
            }
            else{
                break;
            }
        }
        return candiesCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(maxCandiesBobCanBuy(n, a, m));
    }
}
