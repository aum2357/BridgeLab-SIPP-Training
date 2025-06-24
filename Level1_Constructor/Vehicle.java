public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static int registrationFee = 1000; // default fee
    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    // Instance Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName +
                           ", Vehicle Type: " + vehicleType +
                           ", Registration Fee: ₹" + registrationFee);
    }
    // Class Method to update registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }
    // Main Method for Testing
    public static void main(String[] args) {
        // Creating Vehicle instances
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");
     // Display vehicle details before updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        // Update the registration fee
        Vehicle.updateRegistrationFee(1500);
        // Display vehicle details after updating fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
