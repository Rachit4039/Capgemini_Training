package level1.Instance;
public class VehicleRegistration {

    static class Vehicle {

        private String ownerName;
        private String vehicleType;

        static int registrationFee = 1000;

        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        void displayVehicleDetails() {
            System.out.println( ownerName);
            System.out.println(vehicleType);
            System.out.println(registrationFee);
        }

        static void updateRegistrationFee(int newFee) {
            registrationFee = newFee;
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rachit", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);

        Vehicle v2 = new Vehicle("Aman", "Bike");
        v2.displayVehicleDetails();
    }
}
