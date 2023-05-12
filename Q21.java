public class Q21 {

    public static void main(String[] args) {

        // Booleans cannot be used in switch statement
        // So need to change Boolean opt to String opt here
        String opt = "true";

        switch (opt) {
            case "true":

                System.out.print("True");
                break;

            default:
                System.out.print("***");

        }
        System.out.println("Done");

    }

}
