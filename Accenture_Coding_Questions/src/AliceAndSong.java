import java.util.Scanner;

public class AliceAndSong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int k = sc.nextInt();
        System.out.println(maxFavouriteSongs(s, k));
    }
    public static int maxFavouriteSongs(String str , int k){
        int n = str.length();
        if (k > n) return 0;;

        int maxCount = 0;
        int favInWindow = 0;
        for(int i = 0; i < k; i++){
            if(str.charAt(i) == 'a') favInWindow++;
        }
        maxCount = favInWindow;

        for(int i = k; i < n; i++){
            if(str.charAt(i - k) == 'a') favInWindow--;

            if(str.charAt(i) == 'a') favInWindow++;
            maxCount  = Math.max(maxCount,favInWindow);
        }
        return maxCount;
    }
}
