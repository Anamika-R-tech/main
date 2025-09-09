package Instance;
class Course{
	String coursename;
	int duration_in_min;
	int fee;
	Course(String coursename, int duration_in_min, int fee){
		this.coursename = coursename;
		this.duration_in_min = duration_in_min;
		this.fee = fee;
	}
	public void displayCourseDetails() {
        System.out.println("Course Name: " + coursename);
        System.out.println("Duration_in_min: " + duration_in_min);
        System.out.println("fee: "+ fee);
    }
}
public class Problem2 {
	static String instituteName = "GLA";

    public static void main(String[] args) {
        Course c1 = new Course("AI", 60000, 50000);
        Course c2 = new Course("ML", 30000, 60000);
        instituteName = "IIT Bombay";

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Problem2 obj = new Problem2();
        obj.updateInstituteName();
    }

    void updateInstituteName() {
        System.out.println("Updated Institute: " + instituteName);
    }

}
