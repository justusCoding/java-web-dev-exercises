package exercises;
import java.util.Scanner;


public class MperG {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("how many miles have you driven");
        double milesAmount =input.nextDouble();
        System.out.println("how much gas have you consumed");
        double gasConsumed = input.nextDouble();

        double MPG = milesAmount/gasConsumed;
        System.out.println(" you are getting " +MPG +" per gallon");
    }
}
