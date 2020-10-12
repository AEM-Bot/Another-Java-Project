public class PrinterRunner {
    public static void main(String[] args) {

        //setting values using constructor
        //Printer printer = new Printer(100, false);
//        System.out.println("Number of Pages Printed: " +
//                printer.getNumberOfPagesPrinted());
//        System.out.println("Toner Level is: " +
//                printer.getTonerLevel());
//
//        printer.numberOfPagesPrintedFromPrinter(30);
//        System.out.println("Number of Pages Printed: " +
//                printer.getNumberOfPagesPrinted());
//        System.out.println("Toner Level after " + printer.getNumberOfPagesPrinted() + " is: " +
//                printer.getTonerLevel());
//
//        printer.numberOfPagesPrintedFromPrinter(40);
//        System.out.println("Number of Pages Printed: " +
//                printer.getNumberOfPagesPrinted());
//        System.out.println("Toner Level after " + printer.getNumberOfPagesPrinted() + " is: " +
//                printer.getTonerLevel());
//
//        printer.numberOfPagesPrintedFromPrinter(40);
//        System.out.println("Number of Pages Printed: " +
//                printer.getNumberOfPagesPrinted());
//        System.out.println("Toner Level after " + printer.getNumberOfPagesPrinted() + " is: " +
//                printer.getTonerLevel());

        Printer printer = new Printer(50, false);
        System.out.println("Initial Page Count " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.numberOfPagesPrintedFromPrinter(4);
        System.out.println("Pages Printed was " + pagesPrinted +
                " new total print count for printer " + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.numberOfPagesPrintedFromPrinter(2);
        System.out.println("Pages Printed was " + pagesPrinted +
                " new total print count for printer " + printer.getNumberOfPagesPrinted());

    }
}
