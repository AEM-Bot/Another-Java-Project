public class SwitchChallenge {
    public static void main(String[] args) {
        char switchChar = 'B';

        switch (switchChar) {
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is Found");
                break;
            case 'C':
                System.out.println("C is Found");
                break;
            case 'D':
                System.out.println("D is Found");
                break;
            case 'E':
                System.out.println("E is Found");
                break;
            default:
                System.out.println("Neither A, B,C,D or E found");
                break;
        }
    }
}
