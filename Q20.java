public class Q20 {

    public static void main(String[] args) {
        int x = 5;
        while(isAvailable(x)) {
            System.out.print(x);
            x--;
        }

        // x-- -> x will be decreased by 1 after this statement completes
        // --x -> x will be decreased by 1 now, before this statement

    }

    public static boolean isAvailable (int x) {

        // x is an int, pass by value
        // so x-- here never implies the x in main
        // return false when x = 1
        return x-- > 0 ? true : false;
    }
}

