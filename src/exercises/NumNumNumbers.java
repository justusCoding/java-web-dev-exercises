package exercises;
import java.util.Scanner;

public class NumNumNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("what is the length of a rectangle");
        int userLength = input.nextInt();

        System.out.println("what is the width of the rectangle");
        int userWidth = input.nextInt();
        input.close();
        int area = userWidth*userLength;
        System.out.println("the length of the rectangle is: "+ userLength+" the width of the rectangle is: "+ userWidth);
        System.out.println("the area of the rectangle is: "+ area);

    }

}
