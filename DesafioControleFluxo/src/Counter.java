public class Counter {
    public static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("Invalid parameters: the first parameter must be strictly less than the second one.");
        }

        int count = parameterTwo - parameterOne;

        for (int i = 0; i < count; i++) {
            System.out.println("Printing number " + (i + 1));
        }
    }
}
