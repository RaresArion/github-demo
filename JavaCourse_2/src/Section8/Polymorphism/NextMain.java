package Section8.Polymorphism;

public class NextMain {
    public static void main(String[] args) {

        Movie jaws = Movie.getMovie("A", "Jaws");
        Adventure jaws1 = (Adventure) jaws;
        jaws.watchAdventure();
        jaws1.watchAdventure();

        Adventure jaws2 = (Adventure) Movie.getMovie("A", "Jaws");
        jaws2.watchAdventure();

//        var com1 = new Comedy("Brook");
        var com2 = (Comedy) Movie.getMovie("c", "Brooklyn99");
       //  var com3 = (Comedy) com2;
        com2.watchComedy();
    }
}
