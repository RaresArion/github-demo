package Section10.Enummeration;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

//    public double getPrice () {
//        return 0.5;
//    }

    public double getPrice () {
        return switch (this) {
            case MUSTARD -> 0.6;
            case PICKLES -> 2;
            case BACON -> 1.5;
            default -> 0.5;
        };
    }

    public double getPrice (Topping topping) {
        return switch (topping) {
            case MUSTARD -> 0.6;
            case PICKLES -> 1.1;
            case BACON -> 123.2;
            case CHEDDAR -> 12.2;
            case TOMATO -> 1.3;
        };
    }
}
