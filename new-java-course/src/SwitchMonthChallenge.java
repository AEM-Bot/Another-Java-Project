public class SwitchMonthChallenge {
    public static void main(String[] args) {
        String month = "januaRy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not a Valid Month");
                break;
        }
    }
}
