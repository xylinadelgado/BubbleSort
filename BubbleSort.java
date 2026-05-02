import java.util.Scanner;
public class BubbleSort{
    Scanner input  = new Scanner(System.in);
    public void main(String[]args){
            System.out.println("Enter the size of your array");
            int size = input.nextInt();
        if (size >= 8){
            System.out.println("Enter the elements of your array");
            
        } else{ 
            System.out.println("Array is too small, enter a larger number");
            }


    }
}