public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (minutes / (60 * 24 * 365));
            long days = ((minutes) / (24 * 60)) % (365); // 390 days
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
            //1 hr = 60min
            //1 min = 1hr/60
            //1 day = 24 hrs
            //1hr = 1day/24
            //1year = 365 days
            //1 day = 1 year/365

            //year from minutes
            //year --> 365 days -->
            //561600 minutes --> 561600 * (1hr/60) --> 561600 * ( 1 day/24*60) --> 561600 *( 1 year (24*60*365)


            //days from minutes
            //561600 minutes --> 561600 * (1hr/60) --> 561600 * ( 1 day / 24*60)
        }
    }
}