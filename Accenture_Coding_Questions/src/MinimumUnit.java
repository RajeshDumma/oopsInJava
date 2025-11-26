import java.util.*;
public class MinimumUnit {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int p = sc.nextInt();
      int x= sc.nextInt();
      int y = sc.nextInt();

      System.out.println(minUnitConsumption(p, x, y));
    }
    public static int minUnitConsumption(int p, int x, int y){
        int minPower = Integer.MAX_VALUE;
        for(int mCount = 0; mCount*100 <= p; mCount++){
            int remainingCustomer = p - mCount * 100;
            int nCount = (remainingCustomer + 3) / 4;
            int totalPower = mCount * x + nCount * y;
            minPower = Math.min(minPower , totalPower);
        }
        return minPower;
    }
}
