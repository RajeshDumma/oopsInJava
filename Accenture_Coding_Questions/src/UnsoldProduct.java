import java.util.Scanner;

public class UnsoldProduct {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
     int[] result = unSoldProduct(arr);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
    public static int[] unSoldProduct(int[] arr){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        return arr;
    }
}
