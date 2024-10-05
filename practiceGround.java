import java.util.*;
import java.util.stream.Collectors;

public class practiceGround {
    public static void main(String[] args)
    {
        int arr[]={5, 7, 7, 8, 8, 10};
        int mid=(0+arr.length-1)/2;
        int target=5;
        int arr2[]=new int[2];
        arr2[0]=firstOccurance(arr,arr.length-1,target);
        arr2[1]=lastOccurance(arr,arr.length-1,target);
        System.out.println(Arrays.toString(arr2));
    }
    public static int firstOccurance(int[] arr,int mid,int target) {
        int low=0;
        int high=mid;
        int firstOccurance=-1;
        while(low<=high) {
            mid=(low+high)/2;
            if(arr[mid]==target) {
                firstOccurance=mid;
                high=mid-1;
            }
            if(arr[mid]!=target) {
                low=mid+1;
            }
        }
        return firstOccurance;
    }

    public static int lastOccurance(int[] arr,int mid,int target) {
        int low=0;
        int high=arr.length-1;
        int lastOccurance=-1;
        while(low<=high) {
            mid=(low+high)/2;
            if(arr[mid]==target) {
                lastOccurance=mid;
                low=mid+1;
            }
            if(arr[mid]!=target) {
                high=mid-1;
            }
        }
        return lastOccurance;
    }

    }