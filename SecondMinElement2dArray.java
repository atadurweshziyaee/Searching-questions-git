import java.util.Scanner;
public class SecondMinElement2dArray {
    public static void main(String[] args) {
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

        int result = secondMin(arr, row, col);

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

        System.out.println("Your second min element in 2d array is "+result);
    }

    public static int secondMin(int[][] arr, int row, int col){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]<min){
                    secondMin = min;
                    min = arr[i][j];
                }
                else if(arr[i][j] < secondMin && secondMin != min){
                    secondMin = arr[i][j];
                }
            }
        }
        return secondMin;
    }
}