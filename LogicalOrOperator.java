public class LogicalOrOperator {
    public static class main {
        public static void main(String[] args) {
            int topScore = 91;
            int secondTopScore = 95;
            if((topScore > 90) || (secondTopScore <= 90)) {
                System.out.println("Either or both of the conditions are true");
            }

            int topScore2 = 80;
            int secondTopScore2 = 95;
            if((topScore2 > 90) || (secondTopScore2 <= 90)) {
                System.out.println("Either or both of the conditions are true");

            }
        }
    }
}
