package nestedif;
import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isStudent ;
        boolean isSenior ;

        System.out.println("are you a student [true or false]: ");
        isStudent = sc.nextBoolean();

        System.out.println("are you a senior{true or false}: ");
        isSenior = sc.nextBoolean();


        if(isStudent == true){
            if(isSenior == true){
                System.out.println("you are senior and student you got 30% discount");

            }
            else {
                System.out.println("you are student only got 20%");
            }

            
        }
        else {
            System.out.println("you are only senior you only got 10%");
        }
    }
    
}
