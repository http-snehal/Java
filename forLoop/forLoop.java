package forLoop;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many time will loop run: ");
        int max = sc.nextInt();

        for(int i = 0; i<=max ; i++){
            System.out.println(i);
        }

    }
    
}
