package printf;

public class printf {
    public static void main(String[] args) {

// printf is a method used to format output 

// %[flag][width][.precision][specific character]

        String name = "snehal";
        int age = 20;
        double gpa =8.99;
        boolean isStudent = true;
        double price1 = 100.15;
        double price2 = 90.09;
        double price3 = 22.44444;

        System.out.printf("my name is %s \n" , name);
        System.out.printf("the age is %d \n" , age);
        System.out.printf("the gpa is %f \n" , gpa);
        System.out.printf("the bool is %b \n" , isStudent);
        System.out.printf("%.1f \n ", price1);
        System.out.printf("%.2f \n ", price2);
        System.out.printf("%.3f \n ", price3);

        // + output a +
        // , grouping seperator 
        // ( negative numbers are enclosed in ()
        // space display a minus if negative and space if positive 

        double a = 9.999;
        double b = -53.22;

        System.out.printf("%+f \n" , a);
        System.out.printf("%,f \n" , b);
        System.out.printf("%(f \n" , a);
        System.out.printf("%(f \n" , b);
        System.out.printf("% f \n" , a);
        System.out.printf("% f \n" , b);

        // width 

        // 0 = zero paddoing 
        // number = right justified padding 
        // negative = left justified padding

        int a1 = 1;
        int a2 = 11;
        int a3 =1111;

        System.out.printf("%04d \n", a1);
        System.out.printf("%04d \n ", a2);
        System.out.printf("%04d \n", a3);

        System.out.printf("%4d \n", a1);
        System.out.printf("%4d \n", a2);
        System.out.printf("%4d \n", a3);

        System.out.printf("%-4d \n", a1);
        System.out.printf("%-4d \n", a2);
        System.out.printf("%-4d \n", a3);





    }
    
}
