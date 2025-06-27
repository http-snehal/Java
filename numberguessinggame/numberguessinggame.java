package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {

    public static void main(String[] args) {
    
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int randomnumbers = random.nextInt(1 ,11);

    System.out.println("welcome to number guessing game");
    System.out.println("enter the number[1-10]: ");

    do{
        System.out.print("enter the guess: ");
        guess = sc.nextInt();
        attempts++;

        if(guess == randomnumbers){
            System.out.printf("you are the winner the number is %d \n" , randomnumbers);
            System.out.printf("In %d attempts" , attempts);
        }

        else if(guess<randomnumbers){
            System.out.println("TOO LOW!!");

        }

        else if(guess>randomnumbers){
            System.out.println("TOO HIGH!!");
        }
      

    }
        while(guess != randomnumbers);



   
}

}
