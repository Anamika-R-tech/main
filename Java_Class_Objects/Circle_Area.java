package Java_Class_Objects;

class Circle{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	void areaOfCircle() {
		System.out.println("Area of circle is " +radius*radius);
     }
	void circumOfCircle() {
		System.out.println("Circumference of circle is " +2*3.14*radius);
	}
}
public class Circle_Area {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		c1.areaOfCircle();
		c1.circumOfCircle();
	}

}
