public class Q12 {

    public static void main(String[] args) {
        String a = "A";
        a = a.concat("B");

        String b = "C";
        a = a.concat(b);
        // Replace C in a with D, but never updates a
        // so a is still ABC
        a.replace("C","D");

        a = a.concat(b);
        // ABCC
        System.out.println(a);
    }
}
