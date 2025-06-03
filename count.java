import java.util.Arrays;

public class count {
    public static void sortZeroOneTwo(int arr[]){
        int c0=0, c1=0, c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;

            }
            else if(arr[i]==1){
                c1++;
            }
            else if(arr[i]==2){
                c2++;
            }



        }
        int index = 0;
        while(c0> 0){
            arr[index++]=0;
            c0--;
        }
        while(c1> 0){
            arr[index++]=1;
            c1--;
        }
        while(c2> 0){
            arr[index++]=2;
            c2--;

        }

    }

public static void main(String[] args) {
    int[] arr = new int[] {1, 0, 0, 2, 2 ,1};
    sortZeroOneTwo(arr);
    System.out.println(Arrays.toString(arr));
}
}
