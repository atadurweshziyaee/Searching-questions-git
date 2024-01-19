import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch2dArray{
    public static void main(String args[]){
        // taking the size of the 2-D array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int row = sc.nextInt();
        System.out.println("Enter the size of the column:");
        int col = sc.nextInt();

        // 2D array decleration;

        int[][] arr = new int[row][col];

        // taking the input in 2d array.
        
        System.out.println("Enter the element one by one:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // taking the input from user. target element that is to be searched.

        System.out.println("Enter the searching element that you want in 2d array");
        int target = sc.nextInt();

        int[] result = linearSearch(arr, target, row, col);

        // printing the matrix like a list form.

        System.out.print("[");
        for(int i=0;i<row;i++){
            System.out.print("[");
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("],");
        }
        System.out.println("]");
        System.out.println();

        System.out.println("Element found at index " + Arrays.toString(result));


    }

    // linear search method for finding the element in 2d array.
    
    public static int[] linearSearch(int[][] arr, int target, int row, int col){

        if(arr.length == 0){
            System.out.println("Nothing to search");
            return new int[]{-1,-1};
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}