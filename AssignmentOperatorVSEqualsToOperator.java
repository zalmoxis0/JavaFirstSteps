public class AssignmentOperatorVSEqualsToOperator {
    public static class main {
        public static void main(String[] args) {
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
            }


        /*
        No error because the isCar variable is a boolean.
         */

      /*  boolean isCar = false;
        if (isCar = true) {
            System.out.println("oops");
        }
       */

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("oops");
        }

        }
    }
}
