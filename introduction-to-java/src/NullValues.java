public class NullValues {

    public static void main(String[] args) {

        String nullString = null;
//        String nullString = NULL;
        String blankString = "";
//        int intValue = 0;

//        System.out.println("Null string value: " + nullString);
//        System.out.println("intValue: " + intValue);
        System.out.println("Is a null string the same as a blank one? : "
//                + blankString.equals(nullString)
                + nullString.equals(blankString));
    }
}
