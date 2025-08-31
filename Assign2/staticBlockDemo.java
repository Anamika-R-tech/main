public class staticBlockDemo {
	    static int count;
	    static {
	        count = 100;
	        System.out.println("Static block executed. Count initialized.");
	    }

	    public static void main(String[] args) {
	        System.out.println("Value of count: " + count);
	   }
}