package compoundintrest;
import java.util.Scanner;

public class compoundintrestcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principle amount: ");
        double principle = sc.nextDouble();

        System.out.println("enter the rate: ");
        double rate = sc.nextDouble();

        System.out.println("enter the timecompounded: ");
        int timecompounded = sc.nextInt();

        System.out.println("enter the time : ");
        int time = sc.nextInt();

        double amount;

        amount = principle*(Math.pow(1 + (rate/timecompounded), timecompounded*time));

        System.out.printf("the amount is %f in %d years" , amount , time);
        
    }
    
}
