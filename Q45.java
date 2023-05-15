import java.util.ArrayList;

public class Q45 {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        String[] myArray;

        try {
            // Runs forever until an out of memory error
            // which cannot be caught
            while (true) {
                myList.add("My String");
            }
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Ready to Use");
    }
}
