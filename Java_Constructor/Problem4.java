package Java_Constructor;
class HotelBookingSystem{
	String guestname;
	String roomtype;
	int night;
	HotelBookingSystem(){
		guestname = "xyz";
		roomtype = "non AC";
		night = 1;
	}
	HotelBookingSystem(String guestname, String roomtype, int night){
		this.guestname = guestname;
		this.roomtype = roomtype;
		this.night = night;
	}
	HotelBookingSystem(HotelBookingSystem var){
		this.guestname = var.guestname;
		this.roomtype = var.roomtype;
		this.night = var.night;
	}
	void displayOrderDetails() {
        System.out.println("Guest Name: " + guestname);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Night: " + night);
 
    }

	
}
public class Problem4 {

	public static void main(String[] args) {
		HotelBookingSystem hbs1 = new HotelBookingSystem();
		hbs1.displayOrderDetails();
		HotelBookingSystem hbs2 = new HotelBookingSystem("abc", "AC",2);
		hbs2.displayOrderDetails();
		HotelBookingSystem hbs3 = new HotelBookingSystem(hbs2);
		hbs3.displayOrderDetails();
		
		
	}

}
