public class ComparisonOperators {

    public static void main(String[] args) {

//        boolean x = true;
//        boolean result = x == true;

//        System.out.println("x == true : " + result);

//        boolean x = true;
//        boolean y = false;

//        System.out.println("x == true : " + (x == true));
//        System.out.println("x == false : " + (x == false));
//        System.out.println("x != false : " + (x != false));

//        System.out.println("x == true : " + (x == true));
//        System.out.println("y == false : " + (y == false));
//        System.out.println("x == y : " + (x == y));
//        System.out.println("x != y : " + (x != y));

//        int x = 5;
//        int y = 7;

//        System.out.println("x == y : " + (x == y));
//        System.out.println("x != y : " + (x != y));
//        System.out.println("x == 5 : " + (x == 5));
//        System.out.println("x != 5 : " + (x != 5));
//        System.out.println("y == 5 : " + (y == 5));
//        System.out.println("y != 5 : " + (y != 5));

//        System.out.format("\nFinal x = %d \t Final y = %d", x, y);

//        int x = 5;
//        int y = 7;

//        System.out.println("x < 10 : " + (x < 10));
//        System.out.println("x > 10 : " + (x > 10));
//        System.out.println("x < y : " + (x < y));
//        System.out.println("x < 5 : " + (x < 5));
//        System.out.println("x <= 5 : " + (x <= 5));
//        System.out.println("x > 5 : " + (x > 5));
//        System.out.println("x >= 5 : " + (x >= 5));

//        System.out.format("\nFinal x = %d \t Final y = %d", x, y);

        String x = "Java";
        String y = "Beverage";

        System.out.println("x.equals(\"Java\") : " + (x.equals("Java")));
        System.out.println("x.equals(y) : " + (x.equals(y)));
        System.out.println("x.equals(\"java\") : " + (x.equals("java")));
        System.out.println("x.equalsIgnoreCase(\"java\") : " + (x.equalsIgnoreCase("java")));
        System.out.println("!x.equalsIgnoreCase(\"java\") : " + (!x.equalsIgnoreCase("java")));

        System.out.format("\nFinal x = %s \t Final y = %s", x, y);
    }
}
