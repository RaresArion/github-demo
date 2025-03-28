package Section8.Encapsulation.Exercise;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }
        if (this.tonerLevel + tonerAmount > 100) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = pages / 2 + pages % 2;
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted () {
        return this.pagesPrinted;
    }

}
