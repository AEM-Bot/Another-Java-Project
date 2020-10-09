public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(0, 5, 6));
//bigCount --> 5 kilos each
        //smallCount --> 1 kilo each
        //goal --> goal amount of kilos of flour to assemble package
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            bigCount = bigCount * 5;
            int sum = bigCount + smallCount;
            if (sum == goal) {
                return true;
            } else if (sum >= goal && smallCount >= goal % 5) {
                return true;
            }
        }
        return false;
    }
}