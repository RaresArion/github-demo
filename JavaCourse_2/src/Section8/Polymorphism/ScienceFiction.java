package Section8.Polymorphism;

public class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }

    public void watchSF () {
        System.out.println("Watching a ScienceFiction!");
    }

    public void watchMovie () {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}
