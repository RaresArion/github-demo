package Section8.Composition.Exercise;

public class Bedroom {

    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom (String name, Wall wall1, Wall wall2, Wall wall4, Wall wall3,
                    Ceiling ceiling, Bed bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;

        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;

        this.name = name;
    }

    // getters
    public Lamp getLamp() {
        return this.lamp;
    }

    // methods
    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        this.bed.make();
    }
}

class Wall {

    private String direction;

    public Wall (String direction) {
        this.direction = direction;
    }

    // getters
    public String getDirection() {
        return this.direction;
    }
}

class Ceiling {

    private int height, paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    // getters
    public int getHeight() {
        return this.height;
    }

    public int getPaintedColor() {
        return this.paintedColor;
    }
}


class Bed {

    private String style;
    private int pillows, height, sheets, quilt;

    // constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // methods:
    public void make () {
        System.out.print("Bed -> Making | ");
    }

    // getters
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}



class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    // constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // methods
    public void turnOn () {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle () {
        return this.style;
    }

    public boolean isBattery () {
        return this.battery;
    }

    public int getGlobRating () {
        return this.globRating;
    }
}