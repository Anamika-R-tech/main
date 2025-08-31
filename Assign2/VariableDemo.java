public class VariableDemo {
    // Instance variable
    String name = "Instance Variable Example";

    // Static variable
    static int count = 0;

    void showVariables() {
        // Local variable
        int localVar = 50;

        System.out.println("Name (instance): " + name);
        System.out.println("Count (static): " + count);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        obj1.showVariables();

        // Change static variable using obj2
        obj2.count = 10;

        System.out.println("Static variable via class: " + VariableDemo.count);
    }
}
