package org.example;
/** This is a public class App wich contains the main method.
 */
public class App {

    /** This is the main method
     */
    public static void main(String[] args) {
        Car car = new VWGolf("1.9 TDI", "21412841285");


        car.start();
        car.shiftGear(1);
        car.drive(0.01F);
        car.shiftGear(2);
        car.drive(0.02F);
        car.shiftGear(3);
        car.drive(0.5F);
        car.shiftGear(4);
        car.drive(0.5F);

        car.shiftGear(4);

        car.drive(0.5F);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5F);

        car.shiftGear(3);

        car.drive(0.1F);
        car.stop();

        float availableFuel = car.getAvailableFuel();
        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println();
        System.out.println("Vehicles");
        Vehicle vehicle = new VWGolf("2.0 TDI", "12412123");

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        System.out.println();
        System.out.println("Car1");

        Car car1 = (Car) vehicle;

        float availableFuel1 = car.getAvailableFuel();

        float fuelConsumedPer100Km1 = car.getAverageFuelConsumption();

        System.out.println(availableFuel1);
        System.out.println(fuelConsumedPer100Km1);
    }
}
