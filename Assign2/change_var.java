public class change_var {
    public static void main(String[] args) {
        A.x = 10;  // set static variable
        B.new_method(A.x); // call method with A.x
        System.out.println("A.x after method: " + A.x);
    }

    static class A {   // ✅ Now static nested class inside outer class
        static int x;
    }

    static class B {
        public static void new_method(int x) {
            x = 67; // changes only local copy, not A.x
            System.out.println("Inside method, x = " + x);
        }
    }
}
