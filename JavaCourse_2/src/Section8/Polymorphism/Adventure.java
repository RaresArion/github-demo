package Section8.Polymorphism;

public class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    public void watchMovie () {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure () {
        System.out.println("Watching an Adventure!");
    }

    @Override
    public String toString() {
        return super.toString() + " from Adventure class";
    }
}
