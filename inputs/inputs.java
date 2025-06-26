package inputs;
import java.util.Scanner;

public class inputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("whats is your name: ");
        String name = sc.nextLine();

        System.out.print("what is your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a student (true or false)");
        boolean isStudent = sc.nextBoolean();

        System.out.println(name);
        System.out.println(age);
        
        if(isStudent == true){
            System.out.println("your are enrolled");
        }
        else{
            System.out.println("you are not enrolled");
        }
    }
    
}
