
import java.util.Scanner;

// searching element in an array without using the length variable.

public class SlidingWindow {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // declaration of  the array.
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,25,28};

        // Taking user input of searching element.
        System.out.println("Enter the searched element :-");
        int target = sc.nextInt();

        // calling user defined sizeOfArray() method for finding the length of the array.
        int result = sizeOfArray(arr,target);

        if(result >= 0)
            System.out.println("Your element present at "+ result+ " index");
        else
            System.out.println("Your element not found "+ result);

    }

    public static int sizeOfArray(int[] arr, int target){
        int start = 0;
        int end = 1;    

        while(arr[end] < target){
            int temp = end + 1;
            end = end + (end - start + 1);
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }


    // binary search method for searching element in O(log n) time.
    public static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
}
