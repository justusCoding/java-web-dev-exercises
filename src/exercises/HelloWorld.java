package exercises;
import java.io.PrintStream;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        PrintStream system = System.out;
        Scanner input = new Scanner(System.in);
        system.println("hello whats your name: ");
        String name = input.nextLine();
        system.println("Hello "+ name);

    }
}
