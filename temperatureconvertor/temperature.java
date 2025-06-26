package temperatureconvertor;
import java.util.Scanner;;

public class temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to temperature convertor");
        System.out.println("Choose the conversion");
        System.out.println("1. celcius into kelvin");
        System.out.println("2. kelvin into celcius");
        System.out.println("3. celcius into farhanite");
        System.out.println("4. farhanite into celcius");
        System.out.println("5. kelvin into farhanite");
        System.out.println("6.farhanite into kelvin");

        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();
        double kelvin;
        double celcius ;
        double farhanite ;

        switch(choice){

            case 1:
            System.out.print("enter temperature in celcius: ");
             celcius =  sc.nextDouble();

             kelvin = celcius + 273.15 ;

            System.out.printf("the %f in celcius is %.2f kelvin" , celcius , kelvin);
            break ;

            case 2:
            System.out.print("enter temperature in kelvin: ");
             kelvin =  sc.nextDouble();

             celcius = kelvin - 273.15 ;

            System.out.printf("the %f in kelvin is %.2f celcius" , kelvin , celcius);
            break ;


            case 3:
            System.out.print("enter temperature in celcius: ");
             celcius =  sc.nextDouble();

             farhanite = (celcius* 9/5) + 32 ;

            System.out.printf("the %f in celcius is %.2f farhanite" , celcius , farhanite);
            break ;

            case 4:
            System.out.print("enter temperature in farhanite: ");
             farhanite =  sc.nextDouble();

             celcius = (farhanite - 32)*5/9;

            System.out.printf("the %f in farhanite is %.2f celcius" , farhanite , celcius);
            break ;

            case 5:
            System.out.print("enter temperature in kelvin: ");
             kelvin =  sc.nextDouble();

             farhanite = (kelvin - 273.15)*9/5 + 32 ;

            System.out.printf("the %f in kelvin is %.2f farhanite" , kelvin , farhanite);
            break ;

            case 6:
            System.out.print("enter temperature in farhanite: ");
             farhanite =  sc.nextDouble();

             kelvin = (farhanite - 32)*5/9 + 273.15;

            System.out.printf("the %f in farhanite is %.2f kelvin" , farhanite , kelvin);
            break ;

            default:
            System.out.println("invalid choice");

            
        }
        
    }
    
}
