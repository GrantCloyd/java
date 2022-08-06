import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();
        if (!hasNextInt){
            System.out.println("Please enter a number"); return;
        }


        int yearOfBirth = scanner.nextInt();

        int age = 2022 - yearOfBirth;
        if (age < 1 || age > 100) {
            System.out.println("Age is incorrect. Please enter a different age"); return;
        }

        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("You are " + age + " years old and your name is " + name + ".");
        scanner.close();
    }

}
