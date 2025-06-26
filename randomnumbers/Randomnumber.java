package randomnumbers;
import java.util.Random;
import java.util.Scanner;

public class Randomnumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
         int choice ;
        
        System.out.println("Enter the number: ");
        choice = sc.nextInt();


        int number ;
        number = random.nextInt(1,9);
        System.out.println(number);

        
        if (choice == number){
            System.out.println("you win");
        }
        else {
            System.out.println("you loose");
        }
    }

    
}
