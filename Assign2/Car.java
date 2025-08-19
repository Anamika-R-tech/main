public class Car {
    String model;
    int year;
    public Car(String model, int year,int no_of_cars){
        this.model=model;
        this.year=year;

    }
    public static void main(String[] args) {
        Car car1 =new Car("Defender", 2012);
        Car car2 =new Car("Harrier", 2015);
        System.out.println(car1.model+" "+car1.year);
        System.out.println(car2.model+" "+car2.year);
    }
}
