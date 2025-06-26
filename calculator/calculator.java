package calculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2 ; 
        int choice ;
        boolean isValid = false;


        System.out.print("enter the number 1: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the number 2: ");
        num2 = sc.nextDouble();

        System.out.println(" ");

        System.out.println("choose operation \n1. + \n2. - \n3 .* \n4. / \n5. % \n6.^");
        

        System.out.print("enter the choice[1-6]: ");
        choice = sc.nextInt();
        double result = 0 ;

        switch(choice){
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 ->{
             if(num2 == 0) {
                System.out.println("cant divide it with 0");
                isValid = false;

            }
            else{
                result = num1/num2;

            } 
        }
        case 5 -> result = num1 % num2;
        case 6 -> result = Math.pow(num1, num2);

            default -> System.out.println("invalid choice");


        }
        if(isValid == true){
        System.out.println(result);
        }





        
    }
}
