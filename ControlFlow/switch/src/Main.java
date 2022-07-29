import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(3);
        printDayOfTheWeek(6);
        printDayOfTheWeek(100);

//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value  was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("3 4 or 5");
//                break;
//
//            default:
//                System.out.println("Was different");
//                break;
//        }

//        char letter='A';
//
//        switch(letter){
//            case 'A': case 'B': case 'C': case 'D': case 'E':
//                System.out.println(letter + " present");
//                break;
//
//            default:
//                System.out.println("Not an expected letter");
//                break;
//
//        }
    }

    public static void printDayOfTheWeek(int day) {
        String result = "Not a day";

        switch(day){
            case 0:
                result ="Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
               result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
        }

        System.out.println(result);


    }


}
