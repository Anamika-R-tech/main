package Java_Class_Objects;
class Item{
	int itemcode;
	String itemname;
	int price;
	static int cost = 0;
	Item(int itemcode, String itemname, int price){
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
	}
	void displayDetails(int quantity) {
        System.out.println("Itemcode: " + itemcode);
        System.out.println("Itemname: " + itemname);
        System.out.println("Price per item: " + price);
        int totalCost = price * quantity;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + totalCost);
    }
}

public class TrackInventoryItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item(101, "Kurkure", 20);
		Item i2 = new Item(101, "Kurkure", 20);
		i1.displayDetails(5);
		i2.displayDetails(2);

	}

}
