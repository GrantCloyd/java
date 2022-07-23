public class Validations {

    public static boolean validateGreaterThanZero(int minutes){
        return minutes >= 0;
    }

    public static boolean validateBetweenZeroAndSixty(int seconds){
        return seconds >= 0 && seconds <= 59;
    }

}
