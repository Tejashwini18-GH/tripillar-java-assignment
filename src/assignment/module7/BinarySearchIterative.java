package assignment.module7;

public class BinarySearchIterative {
    static int binarySearch(int[] arr, int key){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(binarySearch(arr,7));
    }
}
