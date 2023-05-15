public class Q49 {

    public static void main(String[] args) {

        String str = " ";
        // String.trim : remove all the whitespaces in a given String.
        // But here str is never updated.
        str.trim();

        // String.isEmpty : check if the length of the given String is 0.
        // String.isBlank = str.trim().isEmpty()
        System.out.println(str.equals("") + " " + str.isEmpty());
    }
}
