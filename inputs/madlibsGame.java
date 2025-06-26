package inputs;
import java.util.Scanner;

public class madlibsGame {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);

        String adjective1 ;
        String noun;
        String adjective2;
        String verb;
        String verb2;


        System.out.print("Enter the adjective1 (description with -ful): ");
        adjective1 = sc.nextLine();
        System.out.println("enter the noun(person or animal): ");
        noun = sc.nextLine();
        System.out.println("enter the adjective2 (description): ");
        adjective2 = sc.nextLine();
        System.out.println("enter the verb(with -ing): ");
        verb = sc.nextLine();
        System.out.println("enter the verb2: ");
        verb2 = sc.nextLine();


        System.out.println("Today i saw a guy who is "+ adjective1 + " and he looks like a" + noun );
        System.out.println(" he is"+ verb + " like a"+ adjective2 );
        System.out.println("but then he start " + verb2 );

        



    }

    
    
}
