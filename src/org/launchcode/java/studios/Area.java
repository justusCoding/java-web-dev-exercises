package org.launchcode.java.studios;
 import java.util.Scanner;
public class Area {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a radius: " );
        double rad = input.nextDouble();
        input.close();
        String newRad = String.valueOf(rad);


//        if(rad<0){
//            System.out.println( "enter a non Negative Number");
//        }else if(newRad == "") {
//            System.out.println("you must enter something!!");
//        }else if(rad != ){//supposed to give error if user enters a non-number
//            System.out.println("Enter a number value");
//        }else {
//
//            double area = Circle.getArea(rad);
//            System.out.println("the area if a circle of radius "+ rad+ " is: "+area );
//        }


    }

}
