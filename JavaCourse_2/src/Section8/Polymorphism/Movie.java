package Section8.Polymorphism;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie () {

        String instanceType = this.getClass().getSimpleName();
        // method to get 'a' if the move type starts with a non-vowel or 'an' if it starts with a vowel
        String vowels = "AEIOUaeiou";
        String x = "";
        if (vowels.indexOf(instanceType.charAt(0)) != -1) {
            x = "an";
        } else {
            x = "a";
        }

        System.out.printf("Movie (%s) is %s (%s) being watched from Movie Class\n",
                            this.title, x, instanceType);
    }

    public static Movie getMovie (String type, String title) {
//        System.out.println("Movie.getMovie() first letter of 'type' param: " + type.toUpperCase().charAt(0));
        // Each type of movie has a different initial letter
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    protected void testPrivMethod() {
        System.out.println("Smth from priv method");
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void watchAdventure () {}

    public void watchSF() {
        System.out.println("WatchSF from Movie");
    }
}
