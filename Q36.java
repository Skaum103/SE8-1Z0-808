public class Q36 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Duke");
        String str1 = sb.toString();
        String x = "STR";

        // StringBuilder.insert(): insert the String at the given index of the StringBuilder
        sb.insert(1,x);
        System.out.println(sb.toString());

        // == means "is the same object"
        // String.equals() means is the same string
        String str2 = str1;
        System.out.println(str2 == str1);

        String str3 = new String(str1);
        System.out.println(str3 == str1);

        String str4 = sb.toString();
        System.out.println(str4 == str1);

        String str5 = "Duke";
        System.out.println(str5 == str1);
    }
}
