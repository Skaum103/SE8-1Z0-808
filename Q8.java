public class Q8 {

    public static void main(String[] args) {

        Caller c = new Caller();

        // fails as start and init have private access.

        /*
        c.start();
        c.init();
         */

        // String.toString() will return itself
        String a = "a";
        a.toString();
    }

}
class Caller {

    private void init() {
        System.out.println("inited");
    }

    private void start() {
        init();
        System.out.println("started");
    }

}
