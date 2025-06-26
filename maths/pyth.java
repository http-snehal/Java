package maths;
import java.util.Scanner;
public class pyth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        System.out.println("enter your choice: ");
        choice = sc.nextInt();

        switch(choice){

        case 1:
        System.out.println("enter the perpendicular: ");
        double prep = sc.nextDouble();
        System.out.println("enter the base: ");
        double base = sc.nextDouble();
        
        double a = Math.sqrt(Math.pow(prep , 2) + Math.pow(base , 2));

        System.out.println("the hypotenus : " + a);
        break;

        case 2:
        System.out.println("enter the radius: ");
        double radius = sc.nextDouble();
        
        double circumference = 2*Math.PI*radius;

        System.out.println("the circumference is : " + circumference);

        break;

        case 3:
        System.out.println("enter the radius: ");
        double radius1 = sc.nextDouble();

        double area = Math.PI*(Math.pow(radius1, 2));

        System.out.println("the area is : " + area );
        break; 

        default:
        System.out.println("enter the correct choice");

        }

    }
}
