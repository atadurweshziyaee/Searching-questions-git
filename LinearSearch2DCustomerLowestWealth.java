import java.util.Scanner;

public class LinearSearch2DCustomerLowestWealth{
    public static void main(String[] args) {
        
        // taking the size of 2-D array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size ");
        int row = sc.nextInt();
        System.out.println("Enter the col size ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // taking the input in 2-D array like matric form

        System.out.println("Enter the element one by one");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // finding the minimum wealth of the customer.

        int min = Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            int count = 0;
            for(int j=0;j<col;j++){
                count = count + arr[i][j];
            }
            if(count < min){
                min = count;
            }
        }

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


        System.out.println("the lowest wealth of customer is "+min);
    }
}