public class Q7 {
    public static void main(String[] args) {

        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manual");

        // Seems ti be null,0,Auto
        // But inherited class will automatically call the parent's constructor
        // and the Vehicle class has a default constructor sets type 4W and ms 100
        System.out.println(c1.type + " " +c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " +c2.maxSpeed + " " + c2.trans);

    }

    static class Vehicle{

        String type = "4W";
        int maxSpeed = 100;

        Vehicle(String type, int maxSpeed){
            this.type=type;
            this.maxSpeed=maxSpeed;
        }
        Vehicle(){}

    }

    public static class Car extends Vehicle{

        String trans;

        Car(String trans){ //line n1
            this.trans = trans;
        }

        Car(String type, int maxSpeed, String trans){
            super(type, maxSpeed); //line n2
            this.trans = trans;
        }
    }

}
