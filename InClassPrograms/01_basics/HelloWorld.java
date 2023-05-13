import java.util.Scanner;


public class HelloWorld{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String name;
        System.out.println("What is your name");
        name = scnr.nextLine();
        System.out.println("Hello, " + name + ". Nice to meet you");
        scnr.close();
    }
}