package org.example;
/** This is a public class which extends Car.
 * @param -  String chassisNumber;
 * @param - String model;
 */

public class Series3 extends BMW {
    String chassisNumber;
    String model;
    /** This is the constructor of the class.
     *
     * @param - model;
     * @param - chassisNumber;
     */
    public Series3(String model, String chassisNumber){
        this.chassisNumber = chassisNumber;
        this.model = model;

    }
}
