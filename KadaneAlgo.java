
public class KadaneAlgo {
    public static int main(int[] arr) {
        int cmax= arr[0];
        int gmax= arr[0];
        for(int i=1; i<arr.length; i++) {
            cmax = Math.max(cmax, arr[i]+cmax);
            gmax = Math.max(gmax, cmax);

        }
        return gmax;

    }
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,-4,54,6,7,8,8};
        System.out.println(main(arr));
    }
}
