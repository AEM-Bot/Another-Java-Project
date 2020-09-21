public class SwitchStatement {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Neither 1 nor 2");
        }
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Neither 1 nor 2");
                break;
        }
    }
}
