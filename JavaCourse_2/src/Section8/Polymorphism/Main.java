package Section8.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Section 8 Polymorphism is working");
//        Movie m1 = new Movie("Book of Eli");
//        String x = m1.getClass().getSimpleName();
//        System.out.println("m1 is of type " + x);
//        System.out.println("x ("+x+") is of type " + x.getClass().getSimpleName());
//
//
//        Scanner s = new Scanner (System.in);
//        while(true) {
//            System.out.println("Options");
//            System.out.printf(" - %s%n".repeat(3),
//                    "A - Adventure",
//                    "C - Comedy",
//                    "S - Science Fiction",
//                    "Q - Quit");
//
//            String movieType = s.nextLine();
//            if ("Qq".contains(movieType)) {
//                break;
//            }
//            System.out.println("Enter a Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(movieType, title);
//            movie.watchMovie();
//        }

//        Movie m1 = new Movie("Book of Eli");
        Movie m2 = Movie.getMovie("Science", "Star Wars");
        System.out.println("m2 is of type " + m2.getClass().getSimpleName());
        Movie m3 = new Movie("Star Trek");
        ScienceFiction m4 = new ScienceFiction("Star Wars the Clone Wars");
//        m2.watchMovie();
//        m2.testPrivMethod();
        m3.watchSF();
//        m2.watchSF();
        m4.watchSF();
//        ((ScienceFiction) m2).watchSF();
    }
}
