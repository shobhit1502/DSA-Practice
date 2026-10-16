package BinarySearch;

public class BSImpl {


    static int  bs(int[] arr,int target){

        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;

    }
    static void main() {
        int[] arr = {10,20,30,40,50,60,70};
        int target=70;
        int res = bs(arr,target);
        System.out.println(res);
    }

}
