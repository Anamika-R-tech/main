package Instance;
class Vehicle{
	String  ownerName;
	String vehicleType;
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}
public class Problem3 {
	static int registrationFee = 2000000;

    public static void main(String[] args) {
    	Vehicle v1 = new Vehicle("A", "4-wheeler");
    	Vehicle v2 = new Vehicle("B", "2-wheeler");
    	registrationFee = 3000000;

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Problem3 obj = new Problem3();
        obj.updateRegistrationFee();
    }

    void updateRegistrationFee() {
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

}