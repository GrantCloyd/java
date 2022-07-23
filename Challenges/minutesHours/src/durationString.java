public class durationString {

    public static String getDurationString(int minutes, int seconds){
      boolean validParams = Validations.validateGreaterThanZero(minutes) && Validations.validateBetweenZeroAndSixty(seconds);
      if (!validParams){
          return "Invalid value";
      }

      int remainingMinutes = getRemainingAmountOfIntervalOfTime(minutes);
      int totalHours = convertToNextIntervalOfTime(minutes);

      return sanitizeValues(totalHours) + "h " + sanitizeValues(remainingMinutes) + "m "+ sanitizeValues(seconds) +'s';
    }

    public static String getDurationString(int seconds){
        int totalSeconds = getRemainingAmountOfIntervalOfTime(seconds);
        int totalMinutes = convertToNextIntervalOfTime(seconds);

        return getDurationString(totalMinutes,totalSeconds);
    }

    private static int convertToNextIntervalOfTime(int value){
        return value / 60;
    }

    private static int getRemainingAmountOfIntervalOfTime(int value){
        return value % 60;
    }

    private static String sanitizeValues(int value){
        String stringifiedResult = String.valueOf(value);
        if (value <= 9){
         stringifiedResult = "0" + stringifiedResult;
        }
        return stringifiedResult;
    }

}
