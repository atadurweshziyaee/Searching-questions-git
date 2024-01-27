import java.util.Scanner;

public class CeilingWithCharacterArray{
    public static void main(String[] args){

        // Taking the size of the array (user input).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int size = sc.nextInt();

        //Array declearation 

        char[] arr = new char[size];

        // Taking the input in an array one by one from user.

        if(size !=0)
        System.out.println("Enter the character one by one : ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next().charAt(0);
        }

        int start = 0;
        int end = arr.length-1;


        // this condition is for if the size is zero nothing to do further proccess.
        if(size != 0){
            System.out.println("Enter the searched character:");
            char target = sc.next().charAt(0);

            // calling ceiling method.
            int result = ceilingForCharacter(arr,target,start,end);

            
            if(result >= 0){
                System.out.println("The searching character is not present so,");
                System.out.print("The first greatest nearest character of the searching character is present at ");
                System.out.print(result+ " index i.e character '"+arr[result]+"'");
            }
            else{
                System.out.println("There is no first nearest greatest character present before charcter.");
            }
        }
        else{
            System.out.println("The size is zero so, nothing to do.");
        }


    }


    // ['a','c','e','g','h','j','k']

    // * if our element is 'c' then print the next value i.e 'e'
    // * if our element is 'j' then print the next value i.e 'k'
    // * if out element is the last element of the array then print the 0th index value i.e 'a'
    // * if our element is the 'l' that is > 'k' so it return -1;

    public static int ceilingForCharacter(char[] arr, char target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[arr.length-1] < target){
                return -1;
            }

            if(arr[mid] == target){
                return arr[mid];
            }

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }

        }
        return start;
    }
}