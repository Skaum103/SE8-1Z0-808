public class Q44 {

    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();

        // Redundant cast, b3 is already a Base
        b1 = (Base) b3;
        // Print DerivedB
        b1.test();

        // Redundant cast, b3 is already a DerivedA
        Base b4 = (DerivedA) b3;
        // Print DerivedB
        b4.test();
    }


    public static class Base {
        public void test() {
            System.out.println("Base ");
        }
    }

    public static class DerivedA extends Base {
        public void test() {
            System.out.println("DerivedA ");
        }
    }

    public static class DerivedB extends DerivedA {
        @Override
        public void test() {
            System.out.println("DerivedB ");
        }
    }
}
