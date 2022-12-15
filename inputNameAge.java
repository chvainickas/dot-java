import java.util.Scanner;
public class inputNameAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String myName = sc.nextLine();
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        
        System.out.println("Your name is " + myName + ". Your age is " + age +".");
    }
}