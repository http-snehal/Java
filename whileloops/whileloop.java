package whileloops;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = "" ;

        while(name.isEmpty()){
            System.out.println("enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("hello " + name);
   }
    
}
