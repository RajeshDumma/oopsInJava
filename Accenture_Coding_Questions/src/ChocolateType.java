import java.util.HashMap;
import java.util.*;

public class ChocolateType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] t = new int[n];
        for(int i = 0; i < n; i++){
            t[i] = sc.nextInt();
        }

        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        System.out.println(maxCountNumber(n, k, t, p));
    }
    public static int maxCountNumber(int n, int k, int[] t, int[] p){
        Map<Integer, Integer> TypeOfMinPrice = new HashMap<>();
        for(int i = 0; i < n; i++){
            int type = t[i];
            int price = p[i];
            if(!TypeOfMinPrice.containsKey(type) || price < TypeOfMinPrice.get(type)){
                TypeOfMinPrice.put(type, price);
            }
        }
        if(TypeOfMinPrice.size() < k) return -1;

        List<Integer> prices = new ArrayList<>(TypeOfMinPrice.values());
        Collections.sort(prices);
        int totalCost = 0;
        for(int i = 0; i < k; i++){
            totalCost += prices.get(i);
        }
        return totalCost;
    }
}
