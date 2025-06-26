package arithmetic;
import java.util.Scanner;

public class foodhub {
    public static void main(String args []){
        System.out.println("menu: pizza, burger,fries, coke, combo");
        System.out.println("1.Pizza = 200");
        System.out.println("2.Burger = 120");
        System.out.println("3.fries = 100");
        System.out.println("4.coke = 80");
        System.out.println("5.combo = 300");

        Scanner sc = new Scanner(System.in);

        System.out.println("what you want to order [1-5]: ");
        int choice = sc.nextInt();
        
        System.out.println("quantity");
        int quantity = sc.nextInt();

        int total;

        switch(choice){

            case 1 :
            total = 200*quantity;
            System.out.println("your bill is : " + total);
            break;

            case 2:
             total = 120*quantity;
             System.out.println("your bill is " + total);
             break;

             case 3 :
             total = 100*quantity;
             System.out.println("your bill is " + total);
             break;
             case 4:
             total = 80*quantity;
             System.out.println("your bill is " + total);
             break ;

             case 5: 
             total = 300*quantity;
             System.out.println("your bill is " + total);
             break;

            default :
            System.out.println("make another choice");
        
      
            
            
        }

        

            



    }
    
}
