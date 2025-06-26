package ternaryoperator;
import java.util.Scanner;



public class ternary {
    // ternary are the alternative of if-else
    // variable = condition ? if true : if false
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your age:");
        int age = sc.nextInt();



        String variable = (age>18) ? "you are adult" : "you are not adult" ;

        System.out.println(variable);
        
    }
    
}
