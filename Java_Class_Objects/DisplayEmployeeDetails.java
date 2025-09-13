package Java_Class_Objects;
class Employees{
	String name;
	int id;
	int salary;
	Employees(String name,  int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void showDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Id: "+ id);
		System.out.println("Salary: "+ salary);
	}
}
public class DisplayEmployeeDetails {
	public static void main(String[] args) {
		Employees E1 = new Employees("Anamika", 101, 5000000);
		E1.showDetails();
		
		
		
	}
}
