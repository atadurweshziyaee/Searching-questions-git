import java.util.Scanner;
public class BinarySearch{
    public static void main(String args[]){
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

        // if user not following the any order then we have bubble sort for this.
        // calling method for sorting the array.
        bubbleSort(arr);
        
        // taking the input for searching element.
        System.out.println("Enter the Searching element you want.");
        int target = sc.nextInt();


        int end = arr.length-1;
        int start = 0;


        // calling binary Search method for the give.
        int result = binarySearch(arr, target, start, end);

        if(result > 0)
        System.out.println("your searching element found at "+result+ " index");
        else
        System.out.println("your searching element not found.");
    }

    // this is binary search method for searching the element in log(n) time.
    public static int binarySearch(int[] arr, int target, int start, int end){

        if(arr.length != 0){

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
        }
        else{
            System.out.println("There is no element to be searched");
            return -1;
        }
            return -1;
        
    }

    public static void bubbleSort(int[] arr){
        
        if(arr.length != 0)
        {

            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j] < arr[i]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
}