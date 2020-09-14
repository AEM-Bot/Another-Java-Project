public class SecondsAndMinutesChallenge {

    //Constant if the value is to be constant and being referenced in many methods-- best practice again
    public static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        String hoursCalculated = getDurationString(145, 30);
        System.out.println(hoursCalculated);

        hoursCalculated = getDurationString(8730);
        System.out.println(hoursCalculated);

        hoursCalculated = getDurationString(61, 0);
        System.out.println(hoursCalculated);

        hoursCalculated = getDurationString(65, 45);
        System.out.println(hoursCalculated);


    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int hours = ((minutes / 60));
            int remainingMinutes = minutes % 60;
            // String --. for leading 0s add hoursString and if condition same as for minute and seconds
            if (hours < 10) {
                return "0" + hours + "h " + "0" + remainingMinutes + "m " + "0" + seconds + "s";
            } else {
                return hours + "h " + remainingMinutes + "m " + seconds + "s";
            }

        } else {
            return INVALID_VALUE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            String calculatedTime = getDurationString(minutes, remainingSeconds);
            return calculatedTime;
        } else {
            return INVALID_VALUE;
        }
    }
}

