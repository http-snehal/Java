package logicalOperators;

import java.util.Scanner;

public class usernameprogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String user = null ;
            String pass = null ;
       
        Boolean isuserValid = true ;
        Boolean ispasswordValid = true ;


        System.out.print("enter the username: ");
        String username = sc.nextLine();

        if (username.length()<4 || username.length()>15){

            System.out.println("username should be in 4-15 character" );
            isuserValid = false;
        }
        else if (username.contains(" ")){
            System.out.println("username should not contain spaces");
            isuserValid = false;
        }
        if(isuserValid){
        
             user = username;

            System.out.print("enter the password: ");
            String password = sc.nextLine();

            if(password.length()>=4 && password.length()<=15 && !password.contains(" ")){

                System.out.println("now you can login");
                 pass = password;
            }

            else{
                System.out.println("your password should not contain the spaces and have character range of 4-15");
                ispasswordValid = false;
            }

        }

         if(isuserValid && ispasswordValid){
        System.out.print("enter the username: ");
         String name = sc.nextLine();

        System.out.print("enter the password: ");
        String passkey = sc.nextLine();


            if(user.equals(name) && passkey.equals(pass)){
                System.out.print("welcome in the system");
            }

            else {
                System.out.print("your login credentials is wrong");
            }
        }
            



        


        
    }
    
    }  
       

