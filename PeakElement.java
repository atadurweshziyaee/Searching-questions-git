

// finding peak element in an array (array shouch be in mountain formate).

public class PeakElement {
    public static void main(String args[]){


        // declaration of  the array.
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,1};

        int start = 0;
        int end = arr.length-1;
        int result = peakElement(arr,start,end);
        System.out.println("The highest element in the array is "+arr[result]);
    }

    // this method defination for finding the peak element in mountain array.
    public static int peakElement(int[] arr, int start, int end){

        while(start!=end && start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }

        }

        return start;
    }
}
