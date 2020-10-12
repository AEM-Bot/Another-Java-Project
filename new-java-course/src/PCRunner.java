public class PCRunner {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "DELL",
                "240", dimensions);

        Monitor monitor = new Monitor("27Inch Beast", "Acer",
                27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "V2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

        /*
            One Method by using getters
            thePC object invokes getMonitor in turn invokes drawPixelAt Method
         */
        thePC.getMonitor().drawPixelAt(1500, 1200, "Blue");
        thePC.getMotherboard().loadProgram("Mac OS X");
        thePC.getTheCase().pressPowerButton();


    }
}
