import java.util.Scanner;

public class squareroot {

    public static void answer(int n){
        int[] arr= new int[n];
        for (int i=0;i<n; i++){
            arr[i] = i+1;

        }
        for (int i=0;i<n; i++){
            System.out.print(arr[i]+" ");

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        answer(n);

    }
}
