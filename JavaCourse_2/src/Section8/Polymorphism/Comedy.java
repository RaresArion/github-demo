package Section8.Polymorphism;

public class Comedy extends Movie{

    public Comedy (String title) {
        super(title);
    }

    public void watchComedy () {
        System.out.println("Watching a Comedy!");
    }

    public void watchMovie () {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}
