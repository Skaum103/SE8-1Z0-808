public class Q56 {

    // Multiple main methods work, as long as they don't have the same parameter type

    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("object main " + args[0]);
    }

    public static void main(String[] args) {
        System.out.println("string main " + args[0]);
    }
}
