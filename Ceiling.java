import java.util.Scanner;
public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the size of the array.
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();

        // decleration of the array with size.
        int[] arr = new int[size];

        // Taking the input in an array one by one from user.
        System.out.println("Enter the element one by one : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int end = arr.length -1;
        int start = 0;
        System.out.println("Enter the searched element:");
        int target = sc.nextInt();
        
        System.out.println(ceiling(arr,target,start,end));
    }

    // find the target number if it is present then return its index value.
    // if target number is not present then return the first greater number of target number in an array.
    // example --> 35 is target number but it is not present in array so the nearest greater number is 40
    // then return its index.
    // * return the largest number in the array that is greater than target.

    public static int ceiling(int[] arr, int target, int start, int end){

        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
        }
        return start;
    }
}