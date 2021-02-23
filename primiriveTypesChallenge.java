public class primiriveTypesChallenge {

    public static class main {
        public static void main(String[] args) {
            byte byteValue = 10;
            double doubleValue = 20;
            int intValue = 50;

            double doubleTotal = 50000 + 10 * (byteValue + doubleValue + intValue);
            System.out.println("doubleTotal is " + doubleTotal);

            double result = (double) (1000 + 10 * (byteValue + doubleValue + intValue));

        }
    }
}
