public class PlayingCat {
    public static void main(String[] args) {
        boolean catPlaying = isCatPlaying(true, 10);
        System.out.println(catPlaying);
        catPlaying = isCatPlaying(false, 36);
        System.out.println(catPlaying);
        catPlaying = isCatPlaying(false, 35);
        System.out.println(catPlaying);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else if (!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else {
            return false;
        }
    }
}