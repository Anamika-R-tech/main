package Instance;
class Product {
    String productname;
    int price;
    Product(String productname, int price) {
        this.productname = productname;
        this.price = price;
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productname);
        System.out.println("Price: " + price);
    }
}

public class Problem1 {
    static int totalproducts = 0;

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Phone", 30000);
        
        totalproducts = 2;

        p1.displayProductDetails();
        p2.displayProductDetails();

        Problem1 obj = new Problem1();
        obj.displayTotalProducts();
    }

    void displayTotalProducts() {
        System.out.println("Total Products: " + totalproducts);
    }
}
