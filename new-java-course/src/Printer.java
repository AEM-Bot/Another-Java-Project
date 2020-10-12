public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numberOfPagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

//    public void fillUpToner(int numberOfPagesPrinted) {
//        if (numberOfPagesPrinted > 0 && numberOfPagesPrinted <= 30) {
//            this.tonerLevel -= 30;
//        } else if (numberOfPagesPrinted > 30 && numberOfPagesPrinted <= 60) {
//            this.tonerLevel -= 30;
//        } else if (numberOfPagesPrinted > 60 && numberOfPagesPrinted <= 100) {
//            this.tonerLevel -= 40;
//        } else {
//            this.tonerLevel = 0;
//            System.out.println("Toner Level is: " + this.tonerLevel +
//                    " Please fill up the toner, pages in queue " + (this.numberOfPagesPrinted - 100));
//        }
//    }

    public int numberOfPagesPrintedFromPrinter(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
