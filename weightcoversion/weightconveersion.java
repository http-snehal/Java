package weightcoversion;
import java.util.Scanner;

public class weightconveersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choice ;
        System.out.println("choose the conversion");

        System.out.println("1.Convert kg into lbs");
        System.out.println("2.Convert lbs into kg");

        System.out.print("enter your choice:");
        Choice = sc.nextInt();
        

        
        switch(Choice){

            case 1:
            System.out.print("Enter the weight(in kg): ");
            double kg = sc.nextDouble();

            double lbs = kg*2.205;
            
            System.out.printf("The %.2f kg in lbs is: %.2f. " , kg , lbs);
            break;


            case 2: 
             System.out.print("Enter the weight(in lbs): ");
            lbs = sc.nextDouble();

             kg = lbs/2.205;
            
            System.out.printf("The %.2f. lbs in kg is: %.2f. " , lbs,  kg );
            break;

            default:
            System.out.println("invalid choice");







        }
    }
    
}
