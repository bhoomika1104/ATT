public class RBS {
    public static int main(int[]arr, int key, int s, int e) {
        if(s>e)
            return -1;
        int mid = s+(e-s)/2;
        if(arr[mid]==key){
            return mid+1;
        }
        else if (arr[mid]<key){
            return main(arr,key,mid+1,e);
        }
        else{
            return main(arr,key,s,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,6, 7, 8, 10};

        System.out.println(main(arr,6,0,arr.length-1));
    }

}
