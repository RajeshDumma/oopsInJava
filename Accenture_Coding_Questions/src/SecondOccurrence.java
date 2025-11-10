import java.util.Scanner;

public class SecondOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondDigitOccurrence(n, arr));
    }
    public static int secondDigitOccurrence(int n, int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE) return 0;

        int secondLargestCount = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == secondLargest) secondLargestCount++;
        }
        return secondLargestCount;
    }
}
