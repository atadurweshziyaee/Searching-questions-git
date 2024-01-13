import java.util.Scanner;

public class LinearSearchWithinRange{
    public static void main(String args[]){

        // Taking the size of the array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        // array declaration.

        int[] arr = new int[size];

        // Taking the input in an arry one by one.

        System.out.println("Enter the element one by one :-");
        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        // Taking input from user for searching element in the array.
        System.out.println("Enter the searching element ");
        int target = sc.nextInt();

        // Taking the range from where you start searching.

        System.out.println("Enter the range from where you want to start searching your element ");
        int start = sc.nextInt();

        // Taking the range till where you end searching.
        
        System.out.println("Enter the range till where you want to end" );
        int end = sc.nextInt();

        // calling method for searching the element within given range.

        int result = linearSearchWithinRange(arr, target, start, end);

        if(result == -1){
            System.out.println("Your searching element Not found");
        }
        else {
            System.out.println("your seaching element if Found at "+result+" index");
        }
    }

    public static int linearSearchWithinRange(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            System.out.println("Nothing to search");
            return -1;
        }
        
        // this condition used for checking start and end value within length of the array.
        if(start < arr.length && end < arr.length){

            for(int i=start;i<=end;i++){
                if(arr[i] == target){
                    return i;
                }
            }
        } else {
            System.out.println("Exceeds the range ");
        }
        return -1;
    }
}