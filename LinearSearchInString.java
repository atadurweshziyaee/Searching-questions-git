import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {
        // taking the input from user.

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // taking the input for searching element.
        System.out.println("Enter the Searching element");
        char target = sc.next().charAt(0);
        int size = str.length();

        // method calling.

        int result = linearSearchInString(str, target, size);

        if(result > -1)
        System.out.println("your searching character found at "+result+" index");
        else 
        System.out.println("Your searching character is not found ");
        
    }


    // method implementation.

    public static int linearSearchInString(String str, char target, int size){
        if(size == 0){
            return -1;
        }

        for(int i=0;i<size;i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}