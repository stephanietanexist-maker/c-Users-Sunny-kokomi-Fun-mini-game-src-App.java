import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       //Name and age input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();   
        System.out.println( "Please enter your age:");
        int age = scanner.nextInt();
        scanner.close();
        int nextAge = age + 1;
        
        // Result
        System.out.println ("");
        System.out.println ("Hello, "+name+"!");
        System.out.println ("You are "+age+" years old.");
        System.out.println ("Next year, you will be "+nextAge+" years old.");
    }
}
