public class Q23 {

    public static void main(String[] args) {

        int x = 100;
        // x++: +1 after this statement, a = 100, x = 101
        int a = x++;
        // ++x: +1 before this statement, b = 102, x = 102;
        int b = ++x;
        // x++: +1 after this statement, c = 102, x = 103
        int c = x++;

        int d = (a < b) ? (a < c) ? a: (b < c)? b: c: x;
        System.out.println(d);

    }

    // Q31
    /*
    ACE
    Which three are advantages of the Java exception mechanism? (Choose three.)
    A. Improves the program structure because the error handling code is separated from the normal program function
    B. Provides a set of standard exceptions that covers all possible errors
    C. Improves the program structure because the programmer can choose where to handle exceptions
    D. Improves the program structure because exceptions must be handled in the method in which they occurred
    E. Allows the creation of new exceptions that are customized to the particular program being created
     */
}
