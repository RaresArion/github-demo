package Section8.Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {

//    ( String description, double avgKm, int battery, int cylinders)
        Car car1 = Car.getCar("gas", 800.92, 86, 2200);
        Car car12 = Car.getCar("gas", 800.92, 86, 2500);
        Car car2 = Car.getCar("Electric", 540.92, 78, 0);
        Car car3 = Car.getCar("hybrid", 680.92, 120, 1400);
        Car car32 = Car.getCar("hybrid", 700.92, 132, 2100);
        Car car4 = Car.getCar("asd", 680.92, 120, 1400);


        System.out.println();
        car1.startEngine();
//        car1.zeroTo100();
        ((GasPoweredCar) car1).sportCar(45.44);
        ((GasPoweredCar) car12).sportCar(45.44);
        System.out.println();
        ((HybridCar) car3).tonnage();
        ((HybridCar) car32).tonnage();

        System.out.println();
        car2.startEngine();

    }
}
