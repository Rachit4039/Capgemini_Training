import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    interface Insurable {
        double calculateInsurance();
        String getInsuranceDetails();
    }

    static abstract class Vehicle implements Insurable {
        protected String vehicleNumber;
        protected String type;
        protected double rentalRate;
        private String insurancePolicyNumber;

        Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
            this.vehicleNumber = vehicleNumber;
            this.type = type;
            this.rentalRate = rentalRate;
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        protected String getIPN() {
            return insurancePolicyNumber;
        }

        abstract double calculateRentalCost(int days);
    }

    static class Bike extends Vehicle {

        Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
            super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
        }

        @Override
        double calculateRentalCost(int days) {
            return rentalRate * days;
        }

        @Override
        public double calculateInsurance() {
            return rentalRate * 0.05;
        }

        @Override
        public String getInsuranceDetails() {
            return getIPN();
        }
    }

    static class Car extends Vehicle {

        Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
            super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
        }

        @Override
        double calculateRentalCost(int days) {
            return rentalRate * days;
        }

        @Override
        public double calculateInsurance() {
            return rentalRate * 0.10;
        }

        @Override
        public String getInsuranceDetails() {
            return getIPN();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bike("B101", 500, "POL123"));
        vehicles.add(new Car("C202", 1000, "POL456"));

        for (Vehicle v : vehicles) {
            double totalCost = v.calculateRentalCost(5) + v.calculateInsurance();
            System.out.println(v.type + " Total Cost for 5 days: " + totalCost +
                               ", Insurance Policy: " + v.getInsuranceDetails());
        }
    }
}
