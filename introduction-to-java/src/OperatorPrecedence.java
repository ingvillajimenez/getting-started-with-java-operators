public class OperatorPrecedence {

    public static void main(String[] args) {

        double a = 2, b = 5, c = 6, d = 10;

//        System.out.println("a + b * d = " + (a + b * d));
//        System.out.println("(a + b) * d = " + (a + b) * d);
//        System.out.println("a + (b * d) = " + (a + (b * d)));

        System.out.println("a + b / d = " + (a + b / d));
        System.out.println("(a + b) / d = " + ((a + b) / d));
        System.out.println("a + b / d - c = " + (a + b / d - c));
        System.out.println("a + b / (d - c) = " + (a + b / (d - c)));

        // Java Operator Precedence
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
    }
}
