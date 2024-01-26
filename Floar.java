import java.util.Scanner;
public class Floar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the size of the array.
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();

        // decleration of the array with size.
        int[] arr = new int[size];

        // Taking the input in an array one by one from user.

        if(size !=0)
        System.out.println("Enter the element one by one : ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // if user does not follow any order. calling sort method.
        bubbleSort(arr);

        int end = arr.length -1;
        int start = 0;

        if(size != 0){
            System.out.println("Enter the searched element:");
            int target = sc.nextInt();

            // calling floar method.
            int result = floar(arr,target,start,end);

            
            if(result >= 0){
                System.out.println("The searching element is not present so,");
                System.out.print("The first smallest nearest number of the searching element is present at ");
                System.out.print(result+ " index i.e "+arr[result]);
            }
            else{
                System.out.println("There is no first nearest smallest number present before element.");
            }
        }
        else{
            System.out.println("The size is zero so, nothing to do.");
        }
    }


    // find the target number if it is present then return its index value.
    // if target number is not present then return the first smallest number of target number in an array.
    // [10,20,30,40,50,60]
    // example --> 35 is target number but it is not present in array so the nearest smallest number is 30
    // then return its index.

    public static int floar(int[] arr, int target, int start, int end){
        
        if(arr.length != 0){
            if(target < arr[0]){
                return -1;
            }
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
            System.out.println("Nothing to Searched (size is 0)");
            return -2;
        }
        return end;
    }


    // this method is for sorting the element in asseding order;
    public static void bubbleSort(int[] arr){
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