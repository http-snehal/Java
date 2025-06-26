package string;
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String mail = sc.nextLine();

        String username;
        String domain;

        if(mail.contains("@")){
            username = mail.substring(0 , mail.indexOf("@"));
        domain = mail.substring(mail.indexOf("@" ));

        System.out.printf("The username is: %s and the domain is: %s" , username , domain);

        }
        else{
            System.out.println("enter the valid email");
        }

        


        
    }
    
}
