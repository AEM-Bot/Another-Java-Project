public class EnhancedPlayerRunner {

    public static void main(String[] args) {
        //Constructor ensures the correct fields have been initialized
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Sasanka", 50,
                "AKM");
        /*
            getHealth() is the only way to get the health
            giving all the control to Enhanced Player class to have the logic

         */
        System.out.println("Initial Health = " + enhancedPlayer.getHealth());
    }
}
