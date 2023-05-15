public class Q52 {

    public static void main(String[] args) {
        
        String[] strs = new String[2];
        int idx = 0;

        // The Iterating process works well
        // However, String.concat() method doesn't work for a null String
        // strs[idx] is null
        for (String s:strs
             ) {
            strs[idx].concat(" Element " + idx);
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
