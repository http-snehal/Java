package string;

public class stringmethod {
    public static void main(String[] args) {
        String name = "Snehal kushwah";

        int lenght = name.length();
        char A = name.charAt(7);
        int index = name.indexOf('l');
        int lastindex = name.lastIndexOf("h");
        System.out.println(lenght);
        System.out.println(A);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("k", "s"));
    }
    
}
