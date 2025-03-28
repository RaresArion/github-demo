package Section8.Encapsulation.Challenge;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer (int tonerLevel, boolean duplex) {
        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = Math.min(100, tonerLevel);
        }
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount < 0) {
            System.out.println("Can't add negative toner " + tonerAmount);
            return -1;
        }

//        this.tonerLevel = Math.min (this.tonerLevel + tonerAmount, 100);

        if (this.tonerLevel + tonerAmount > 100) {
            System.out.printf("You added %d, on top of %d so the cartridge has overflown", tonerAmount, this.tonerLevel);
            this.tonerLevel = -1;
        } else {
            System.out.printf("You added %d, on top of %d resulting in a toner level of: %d", tonerAmount, this.tonerLevel, this.tonerLevel + tonerAmount);
            this.tonerLevel = this.tonerLevel + tonerAmount;
        }
        return this.tonerLevel;
    }

    public int printPages (int pages) {
        if (this.tonerLevel <= 0) {
            System.out.println("Toner is EMPTY. Can't print anymore " + this.tonerLevel);
            return -1;
        } else if (this.tonerLevel <= 10) {
            System.out.println("Toner Level is almost empty " + this.tonerLevel);
        }
        if (this.duplex) {
            System.out.println("This is a duplex printer");
            this.pagesPrinted = this.pagesPrinted + (int) Math.ceil((double) 15 / 2);
            this.tonerLevel = this.tonerLevel - pages / 2;
            System.out.println("There is " + this.tonerLevel + "% toner left");
        } else {
            System.out.println("This is NOT a duplex printer");
            this.pagesPrinted = this.pagesPrinted + pages;
            this.tonerLevel = this.tonerLevel - ((int) Math.ceil((double) pages / 2));
            System.out.println("There is " + this.tonerLevel + "% toner left");
        }
        return this.pagesPrinted;
    }


}
