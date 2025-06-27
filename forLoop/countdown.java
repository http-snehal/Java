package forLoop;

import java.util.Scanner;

public class countdown {
    public static void main(String[] args) throws InterruptedException  {

        Scanner sc = new Scanner (System.in);

         System.out.println("enter the occasion: ");
        String occ = sc.nextLine();


        System.out.println("where to start countdown: ");
        int max = sc.nextInt();

       
        for(int i = max ; i>0 ; i-- ){

            System.out.println(i);
            Thread.sleep(1000);
        }
        
            System.out.printf("happy %s" , occ );

     

        }
    }
    

