public class MathOperations {
    public static void main(String[] args) {
        double powerBase = 2.0;
        double powerResult = Math.pow(powerBase, 3);
        System.out.println("Power result: " + powerResult);

        double squareRootValue = 16.0;
        double squareRootResult = Math.sqrt(squareRootValue);
        System.out.println("Square root: " + squareRootResult);

        double numberToRound = 6.0;
        long roundedResult = Math.round(numberToRound);
        System.out.println("Rounded result of 6.0: " + roundedResult);

        double givenRandomNumber = 0.007895794160877712;
        // To generate a similar random number in a small range
        double min = 0.007895794160877712;
        double max = 0.007895794160877713;
        double randomResult = min + (max - min) * Math.random();
        System.out.println("Random number in a similar range: " + randomResult);
    }
}


