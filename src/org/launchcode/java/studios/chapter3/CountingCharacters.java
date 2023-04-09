package org.launchcode.java.studios.chapter3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingCharacters {

    public static void main(String[] args)
    {
        Scanner input = new Scanner((System.in));


        HashMap<Character, Integer> characterCounts = new HashMap<>();
        System.out.println("enter a string and i'll tell you how many of each character there are");
        String myString = input.nextLine().toLowerCase();
//                "If the product of two terms is zero then common sense says at least one of the two terms has to" +
//                " be zero to start with. So if you move all the terms over to one side, " +
//                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                " Once you’ve done that, " +"it’s pretty straightforward from there.";

//        myString.toLowerCase();
        input.close();
        char[] charactersInString = myString.toCharArray();


        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }

    }

