package whileloops;

import java.util.Scanner;

public class infiniteloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){

            System.out.println("you are in the loop");
            System.out.print("press Q to exit");
            response = sc.next().toUpperCase();
        
        }

        System.out.println("you exited a game");

    }
    
}
