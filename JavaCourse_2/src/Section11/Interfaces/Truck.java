package Section11.Interfaces;

public class Truck implements Trackable{


    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + " is tracking something");
    }
}
