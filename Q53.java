public class Q53 {

    public static void main(String[] args) {
        Car y = new Car(20);
        System.out.println(y.y + y.x);
    }

    public static class Vehicle {
        int x;

        Vehicle() {
            this(10);
        }

        Vehicle(int x) {
            this.x = x;
        }
    }

    public static class Car extends Vehicle {
        int y;

        Car() {

            // Call to constructor must be the first statement in body
            // So can either call super() or this(), cannot call together
            // But super() is automatically called, so there is no need to call super()

            /*
            super();
            this(20);
             */
        }

        Car(int y) {
            this.y = y;
        }
    }
}
