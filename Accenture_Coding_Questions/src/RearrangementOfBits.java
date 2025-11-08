import java.util.*;
public class RearrangementOfBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc .nextInt();
        System.out.println(reArrangeBits(n));
    }
    public static int reArrangeBits(int n){
        int countOfOnes = Integer.bitCount(n);
        int result = (1 << countOfOnes) - 1;
        return result;
    }
}
