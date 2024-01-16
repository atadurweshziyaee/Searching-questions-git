import java.util.Scanner;

public class LinearSearchOddNumberOfDigits{
    public static void main(String[] args) {

        // Taking the user input how much array size do you want.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want.");
        int size = sc.nextInt();

        // array decleration.

        int[] arr = new int[size];

        // taking the array input.

        if(arr.length != 0){
            
            System.out.println("Enter the element one by one");
            for(int i=0;i<arr.length;i++){
                System.out.print("arr["+i+"] = ");
                arr[i] = sc.nextInt();
            }
        }
        // method calling.

        int result = evenNumberOfDigits(arr);

        System.out.println("There are "+result+" odd number of digit present in the array");
    }

    // this method is used for finding the even digits in an array.
    public static int evenNumberOfDigits(int[] arr){
        
        int count=0;
        if(arr.length == 0){
            System.out.println("The array size is zero.");
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(isOdd(arr[i])){
                count++;
            }
            
        }
        return count;
    }

    // this method is used for checking the number is even or odd.

    public static boolean isOdd(int num){
        int countDigit = digits(num);

        if(countDigit%2==1){
            return true;
        }
        return false;
    }
    
    // this method is used for finding how many digits present at each element.
    public static int digits(int num){
        
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}