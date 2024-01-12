import java.util.Scanner;

// Normal Linear Search.
public class LinearSearch {
    public static void main(String args[]){

        // taking the size of the array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num = sc.nextInt();

        int[] arr = new int[num];

        // taking the input of in an array.

        System.out.println("Enter the element one by one in an array.");
        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        // taking the input of searching element in the array.

        System.out.print("enter the searching element :- ");
        int target = sc.nextInt();

        // calling liner search method for finding the searching element the array.

        int result  = linearSearch(arr, target);

        if(result >= 0){

            System.out.println("your searching element "+target+" is present at "+result+" index");
        }
        else {
            System.out.println("your searching element is not present in the array");
        }



    }

    // this is the linearSearch method.
    public static int linearSearch(int[] arr, int target){
    
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){

                // if the searching element is matched then it return the index value.
                
                return i;
            }
        }

        // if the searching element is not matched or not present in the array then it simply return -1.

        return -1;
    }
}
