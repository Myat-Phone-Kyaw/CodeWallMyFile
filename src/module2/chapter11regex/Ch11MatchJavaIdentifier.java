package module2.chapter11regex;

import java.util.*;

class Ch11MatchJavaIdentifier {
    /*private static final String STOP = "STOP";
    private static final String VALID = "Valid Java Identifier";
    private static final String INVALID = "Not a valid Java identifier";*/
    private static final String PATTERN = "a[0-9]{7,9}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        while (true) {
            System.out.print("Identifier: ");str =scanner.next();
            if(str.equals("STOP"))break;
            if(str.matches(PATTERN))

            {
                reply = "Valid Java Identifier";
            } else

            {
                reply = "Not a valid Java identifier";
            }
            System.out.println(str +": "+reply +"\n");
        }
    }
}
