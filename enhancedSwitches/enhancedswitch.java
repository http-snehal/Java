package enhancedSwitches;
import java.util.Scanner;

public class enhancedswitch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter the number [1-7]: ");
    int number = sc.nextInt();

    switch(number){
        case 1 -> System.out.println("monday");
        case 2 -> System.out.println("tuesday");
        case 3 -> System.out.println("wednesday");
        case 4 -> System.out.println("thursday");
        case 5 -> System.out.println("friday");
        case 6 -> System.out.println("saturday");
        case 7 -> System.out.println("sunday");

        default -> System.out.println("invalid choice");
    }


    
}
    
    
}
