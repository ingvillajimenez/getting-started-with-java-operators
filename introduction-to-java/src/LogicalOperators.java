public class LogicalOperators {

    public static void main(String[] args) {

//        boolean isJavaFun = true;
//        boolean isCoffeeBitter = true;
//        boolean isTheSkyPurple = false;
//        boolean isTheEarthFlat = false;

        // The OR Operator
//        System.out.println("(isJavaFun || isCoffeeBitter): "
//                + (isJavaFun || isCoffeeBitter));
//        System.out.println("(isJavaFun || isTheSkyPurple): "
//                + (isJavaFun || isTheSkyPurple));
//        System.out.println("(isTheEarthFlat || isCoffeeBitter): "
//                + (isTheEarthFlat || isCoffeeBitter));
//        System.out.println("(isTheSkyPurple || isTheEarthFlat): "
//                + (isTheSkyPurple || isTheEarthFlat));

        // The OR Operator
//        System.out.println("(isJavaFun || isTheSkyPurple || isTheEarthFlat): "
//                + (isJavaFun || isTheSkyPurple || isTheEarthFlat));
//        System.out.println("(isJavaFun || isCoffeeBitter || isTheSkyPurple || isTheEarthFlat): "
//                + (isJavaFun || isCoffeeBitter || isTheSkyPurple || isTheEarthFlat));
//        System.out.println("(isTheSkyPurple || isTheEarthFlat || false): "
//                + (isTheSkyPurple || isTheEarthFlat || false));

        // The AND Operator
//        System.out.println("(isJavaFun && isCoffeeBitter): "
//                + (isJavaFun && isCoffeeBitter));
//        System.out.println("(isJavaFun && isTheSkyPurple): "
//                + (isJavaFun && isTheSkyPurple));
//        System.out.println("(isTheEarthFlat && isCoffeeBitter): "
//                + (isTheEarthFlat && isCoffeeBitter));
//        System.out.println("(isTheSkyPurple && isTheEarthFlat): "
//                + (isTheSkyPurple && isTheEarthFlat));

        boolean isWatchInStock = true;
        int watchPrice = 200;
        int myBudget = 180;
        boolean isThereASale = true;
        int saleDiscount = 30;

        System.out.println("Is the watch available and affordable?: "
                + (isWatchInStock && (watchPrice <= myBudget)));
        System.out.println("Is the watch available and affordable on a sale?: "
                + (isWatchInStock && ((watchPrice - saleDiscount) <= myBudget)));
        System.out.println("Can I buy the watch today?: "
                + (isWatchInStock
                && ((watchPrice <= myBudget)
                || (isThereASale && ((watchPrice - saleDiscount) <= myBudget)))));

    }
}
