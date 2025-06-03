public class flo {
    static int firstOccurrence(int[] arr,int key){
        int s=0;
        int e = arr.length - 1;
        int ans = -1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]==key){
                //store the ans
                // go to the extreme left hand side to find the first occurrence

                ans = mid;
                e=mid-1;
            }else if(arr[mid]<key){
                s=mid+1;

            }else{
                e=mid-1;
            }
        }
        return ans+1;

    }
    static int lastOccurrence(int[] arr,int key){
        int s=0;
        int e = arr.length - 1;
        int ans = -1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]==key){
                //store the ans
                // go to the extreme right hand side to find the first occurrence

                ans = mid;
                s=mid+1;
            }else if(arr[mid]<key){
                s=mid+1;

            }else{
                e=mid-1;
            }
        }
        return ans+1;

    }
    static int totalOccurrences(int[] arr,int key){
        int s=0;
        int e = arr.length - 1;
        int ans = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]==key){
                ans+=1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        int[] arr = {1,2, 4,4, 8,8, 9,9, 9, 9};
        int f = firstOccurrence(arr,9);
        int l = lastOccurrence(arr,9);
        int t = totalOccurrences(arr,9);
        System.out.println("first: "+f+" "+ "|last: "+l+" "+ "|total: "+t);
    }
}
