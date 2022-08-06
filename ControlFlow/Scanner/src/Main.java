import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        readAndSumXNumbers(6);
    }

    public static void firstScanner(){
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

    public static int getValidNumber(int count){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: (#" + count + ")");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int result = scanner.nextInt();
            return result;
        }

        scanner.close();
        return -1;
    }

    public static void readAndSumXNumbers(int numberOfNumbers){
        int total = 0;
        System.out.println("Summing "+ numberOfNumbers + " numbers.");

        for(int i = 1; i <= numberOfNumbers; i++){
            int number = getValidNumber(i);
            if (number == -1) {
                System.out.println("Please only enter numbers. Exiting program.");
                return;
            }else {
                total +=number;
            }
        }
        System.out.println("Your total is " + total);
    }


}
