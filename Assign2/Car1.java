public class Car1 {
    String model;
    int year;
    static int no_of_cars = 0;

    public Car1(String model, int year){
        this.model = model;
        this.year = year;
        no_of_cars++; 
    }

    public static void main(String[] args) {
        Car1 car_1 = new Car1("Defender", 2012);
        Car1 car_2 = new Car1("Harrier", 2015);

        System.out.println(car_1.model + " " + car_1.year);
        System.out.println(car_2.model + " " + car_2.year+" "+no_of_cars);
        System.out.println("Total cars: " + Car1.no_of_cars);
    }
}
