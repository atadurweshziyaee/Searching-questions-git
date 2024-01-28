import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchFirstAndLastPosition {
    public static void main(String args[]){

        // Taking the size of the array with user input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr;

        if(size!=0){

            // Declearation of the array.
            arr = new int[size];

            // Taking the user input one by one.

            System.out.println("Enter the element one by one:-");
            for(int i=0;i<arr.length;i++){
                System.out.print("arr["+i+"] = ");
                arr[i] = sc.nextInt();
                System.out.println();
            }

            // calling Sort method for arranging the element in order.
            selectionSort(arr);

            // printing the element in accending order.
            System.out.println(Arrays.toString(arr));

            int start = 0;
            int end = arr.length-1;

            // Taking the input for searched element.
            System.out.println("Enter the searched element in the array");
            int target = sc.nextInt();

            // calling method for finding the first and last position of the element.
            int[] result = firstAndLastPosition(arr,start,end,target);

            System.out.println("Your element present at"+Arrays.toString(result));

        }



    }

    public static int[] firstAndLastPosition(int[] arr, int start, int end, int target){


        // calling position method for finding the first position of the element in the array.
        // if flag value is true that means it will check the left side of the element that there is more target element present at.
        int first = search(arr,start,end,target,true);

        // calling position method for finding the last position of the element in the array.
        // if flag value is flase that means it will check the right side of the element that there is more target element present at.
        int last = search(arr,start,end,target,false);

        if(first > -1 && last > -1){
            // returning the first and last position of the element.
            return new int[]{first,last};
        }

        // searched element is not present in the arrary.
        return new int[]{-1,-1};
    }

    public static int search(int arr[], int start, int end, int target, boolean flag){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                
                // it will check the left side is also present the same element or not.
                if(flag == true){
                    end = mid - 1;
                }

                // it will check the rigth side is also present the same element or not.
                else if(flag == false){
                    start = mid + 1;
                }
            }

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
        }

        // finally return the answer whatever we have got.
        return ans;
    }
    
    // This method is for sorting the element in ascending order.
    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int max = 0;

            for(int j=0;j<arr.length-i;j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            int temp = arr[max];
            arr[max] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
