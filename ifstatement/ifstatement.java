package ifstatement;
import java.util.Scanner;


public class ifstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("whats your name: ");
        String name = sc.nextLine();
        
        if(name.isEmpty()){
           System.out.println("you didnt enter the name");
        }
        else{
            System.out.println("whats your age: ");
            int age = sc.nextInt();

            if(age>18){
                System.out.println("you are an adult ");
            }
            else if(age == 0){
                System.out.println("you just born");
            }
            else if (age<0){
                System.out.println("you didnt born");
            }
            else{
                System.out.println("you are child");
            }
            

        }
        
        

    }
    
}
