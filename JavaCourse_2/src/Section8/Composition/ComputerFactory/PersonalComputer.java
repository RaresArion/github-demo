package Section8.Composition.ComputerFactory;

public class PersonalComputer extends Product {

    // Composition magic
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

//    public Monitor getMonitor() {
//        return this.monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return this.motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return this.computerCase;
//    }

    private void drawLogo() {
        monitor.drawPixel(1200, 50, "yellow");
    }
    public void powerUp () {
        computerCase.pressPowerButton();
        drawLogo();
    }

}
