public class durationString {

    public static String getDurationString(int minutes, int seconds){
      boolean validParams = Validations.validateGreaterThanZero(minutes) && Validations.validateBetweenZeroAndSixty(seconds);
      if (!validParams){
          return "Invalid value";
      }

      int totalSeconds = getRemainingAmountOfIntervalOfTime(seconds);
      int addedSeconds = convertToNextIntervalOfTime(minutes);
      int totalMinutes = minutes + addedSeconds;
      int remainingMinutes = getRemainingAmountOfIntervalOfTime(totalMinutes);
      int totalHours = convertToNextIntervalOfTime(totalMinutes);

      return sanitizeValues(totalHours) + "h " + sanitizeValues(remainingMinutes) + "m "+ sanitizeValues(totalSeconds) +'s';
    }

    public static String getDurationString(int seconds){
        int totalSeconds = getRemainingAmountOfIntervalOfTime(seconds);
        int totalMinutes = convertToNextIntervalOfTime(seconds);

        return getDurationString(totalMinutes,totalSeconds);
    }

    public static int convertToNextIntervalOfTime(int value){
        return value / 60;
    }

    public static int getRemainingAmountOfIntervalOfTime(int value){
        return value % 60;
    }

    public static String sanitizeValues(int value){
        String stringifiedResult = String.valueOf(value);
        if (value <= 9){
         stringifiedResult = "0" + stringifiedResult;
        }
        return stringifiedResult;
    }

}
