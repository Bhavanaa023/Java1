package pkg1;
class OuterClass {
    private int instanceVar = 10;
    private static int staticVar = 20;
    static class StaticNestedClass {
        public void display() {
            System.out.println("Static variable from OuterClass: " + staticVar);
        }
    }

    // Inner class (non-static)
    class InnerClass {
        public void display() {
            // Can access both instance and static members of the outer class
            System.out.println("Instance variable from OuterClass: " + instanceVar);
            System.out.println("Static variable from OuterClass: " + staticVar);
        }
    }
}

public class B38 {
    public static void main(String[] args) {
        // Accessing the static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Accessing the inner class
        OuterClass outer = new OuterClass(); // Need to create an instance of OuterClass
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}