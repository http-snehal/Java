package logicalOperators;

import java.util.Scanner;

public class logicaloperators {

    //&& logial AND
    //|| LOGICAL OR
    // ! LOGICAL NOT !

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tell me the temperature: ");
        double temp = sc.nextDouble();

        System.out.println("are you happy with weather [true/false]: ");
        boolean happy = sc.nextBoolean();

        
        

        if(temp<=35 && temp >= 15 && happy == true){
            System.out.println("the weather is good");
            System.out.println("yes you are happy");
        }
        else if(temp<35 && temp > 15 && happy != true){
            System.out.println("the weather is good");
            System.out.println("but you are not happy");
        }

        else if((temp>34 || temp<14) && happy == true){
            System.out.println("the weather is bad");
            System.out.println("but you are happy");
        }

        else if((temp>34 || temp<14) && happy != true){
            System.out.println("the weather is bad");
            System.out.println("you are not happy");

        }
    }
    

        

    }
    
    

