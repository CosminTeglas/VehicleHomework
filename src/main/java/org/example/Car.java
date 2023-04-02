package org.example;

/**
 * This is a public class Car
 */
abstract class Car implements Vehicle {
    Integer fuelTankSize = 60;
    String fuelType = "diesel";
    Integer gearMax = 6;
    Float consumptionPer100km = 5.8F;
    Float currentGear;
    Float consumption = 6.1F;
    Float availableFuel = 60F;
    Float driveTrip;

    /**
     * This is a method that override the start method from interface Vehicles;
     */
    @Override
    public void start() {
        System.out.println("The car has started");
        this.currentGear = 1.0F;
        this.consumption = consumptionPer100km;
    }

    /**
     * This is a method that override the drive method from interface Vehicles;
     *
     * @param - n - the nr of the km that the car has driven;
     */
    @Override
    public void drive(float n) {
        this.driveTrip = n;
        System.out.println("The car is driving " + n + "Km");
        this.availableFuel -= (driveTrip * this.consumption / 100);

    }

    /**
     * This is a method that override the stop method from interface Vehicles;
     */
    @Override
    public void stop() {
        System.out.println("Engine stopped");
        System.out.println("You have naw available fuel " + availableFuel +
                " liters and the lest recorded fuel consumption was  " + consumption);
        currentGear = 0.0F;
    }

    /**
     * A void method that calculate the consumption of the car
     *
     * @param - n - the new currentGear;
     */
    public Float shiftGear(float nr) {
        System.out.println("The car change gear to " + nr);
        if ((0 < nr) && (gearMax > nr)) {
            if (currentGear <= nr) {
                consumption = consumptionPer100km - (0.10F * (nr - currentGear));


                System.out.println("The car consumption is decreasing "
                        + consumption);
            } else {
                consumption = consumptionPer100km + (0.10F * (currentGear - nr));

                System.out.println("The car consumption is increasing "
                        + consumption);
            }
        } else System.out.println("The value of currentGear is not correct ");
        currentGear = nr;
        return consumption;
    }

    /**
     * This is a method that get the available fuel;
     */
    public Float getAvailableFuel() {
        System.out.println("The available fuel is ");
        this.availableFuel -= consumption * driveTrip;
        return availableFuel;
    }

    /**
     * This is a method that get the getAverageFuelConsumption;
     */
    public Float getAverageFuelConsumption() {
        System.out.println("The average fuel consumption is " );
        return consumptionPer100km;
    }
}