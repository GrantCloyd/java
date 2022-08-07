import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//        readAndSumXNumbers(6);
        minMaxNumberReader(5);
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

    public static void minMaxNumberReader(int count){
        if (count <= 0){
            System.out.println("Not a valid entry");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int i = 1;
        while (i <= count){
            System.out.println("Enter a whole number (number " + i + " of " + count + ")");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                min = number < min ? number : min;
                max = number > max ? number : max;
                i++;
            }else {
                System.out.println("Not a whole number. Rendering min/max");
                break;
            }
            scanner.nextLine();
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("You didn't enter any numbers. Good day sir");
            return;
        }
        System.out.println("Your min number is: " + min + ", and your max number is: " + max + "!" );
        scanner.close();
    }


}
