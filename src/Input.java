//Declare Import
import java.util.Scanner;


//Make class 
public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        double userWeight;
        boolean inputUserSmoke;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your weight: ");
        userWeight = input.nextDouble();

        System.out.print("Does the user smoke in any kind(true/false): " );
        inputUserSmoke = input.nextBoolean();

        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
        System.out.println("User Weight: " + userWeight);
        System.out.println("User is a smoker: " + inputUserSmoke);

    }
}
