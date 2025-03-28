package Section7;

public class Car  {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;


    // setters
//    public void setMake(String make) {
//        if (make.charAt(0) >= 65 && make.charAt(0) <= 90) {
//            this.make = make;
//        } else {
//            System.out.println(make + " is INVALID! Capitalize the name of 'make'");
//        }
//    }
    public void setMake (String make) {
        if (make == null) {
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> {
                this.make = make;
            }
            case "213" -> {
                // code
                System.out.println("What the fuck is this switch case?");
                this.make = "What the fuck is this switch case in car class? = 213";
            }
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    // =============================================

    // getters
    public String getMake () {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }









    public void printPattern (int number) {
// Prints this: for number = 8
/*
01 02 03 04 05 06 07 08
09 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
49 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64
*/

//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number; j++) {
//                if (i == 1 && j / 10 == 0) {
//                    System.out.print("0" + j + " ");
//                } else if ((j + (number * (i - 1))) / 10 == 0) {
//                    System.out.print("0" + (j + (number * (i - 1))) + " ");
//                } else {
//                    System.out.print((j + (number * (i - 1))) + " ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number; j++) {
//                if ((i == Math.ceil((double)number / 2)) && (j == Math.ceil((double)number / 2))) {
//                    System.out.print("M  ");
//                } else if ((i == 2 || i == number - 1) && ((j == Math.ceil((double)number / 2)))) {
//                    System.out.print("M  ");
//                } else if (i == number - 2 && j == number - 2) {
//                    System.out.print("M  ");
//                } else {
//                    System.out.print("*  ");
//                }
//            }
//            System.out.println();
//        }          }

    }

}
