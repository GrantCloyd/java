public class Main {

    public static void main (String[] args){

  boolean res =  isLeapYear(1924);
  System.out.println(res);

    }

    public static boolean isLeapYear(int year){
        if (year <= 1 || year >= 9999){
            return false;
        }


        boolean stepOne = year % 4 == 0;
        boolean stepTwo = year % 100 == 0;
        boolean stepThree = year % 400 == 0;
        System.out.println(stepOne + " " + stepTwo + " " + stepThree);

        if (stepOne){
            if (stepTwo) {
                return stepThree;
            }
            else {
                return true;
            }
        }
        return false;
    }
}



