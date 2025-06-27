package ex_11_WhileLoop;

import java.util.Random;
import java.util.Scanner;


public class Lab121_while_guessing_game {
    public static void main(String[] args) {
        //guessing game
        // generate Random number => 1 to 100
        // Java has Random class
        Random random =new Random();
        int numberToGuess=random.nextInt(100)+1;//0 to 100
        //if bound=100 then it will take 0-99
        //need to add 1 to make it till 100
        //System.out.println(numberToGuess);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");


       // int attempts = 0;
        while (true)
        {
            int guess= scanner.nextInt();
           // attempts++;

            if(guess < numberToGuess)
            {
                System.out.println("Low, try again");
            } else if (guess>numberToGuess) {
                System.out.println("High, try again");

            }
            else
            {
                System.out.println("it is a match");
              //  System.out.println("you guess in " +attempts +" attempts");
                break;

            }
        }

    }
}
