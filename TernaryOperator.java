public class TernaryOperator {
    public static class main {
        public static void main(String[] args){

            /*
            ==========================================================================================================
            ==========================================================================================================
            The ternary operator is a shortcut to assigning one of two values to a variable depending on a given
            condition.

            It's a shortcut of the if-then-else statement.
            i.e:
                int ageOfClient = 20;
                boolean isEighteenOrOver = ageOfClient = = 20? true: false;
            Operand 1 : ageOfClient == 20 in this case is the condition we are checking. It needs to return true or false.

            Operand two: true here is the value assigned to the variable isEighteenOrOver if the condition above is
            true.

            Operand three: false here is the value to assign to the variable isEighteenOrOver if the condition above was
            false.

            In this case, isEighteenOrOver is assigned the value true because ageOfClient has the value 20.

            ==========================================================================================================
            ==========================================================================================================
             */

            /*
            boolean isCar = false;
            boolean wasCar = isCar ? true : false;
            if(wasCar) {
                System.out.println("wasCar is true");
            }
            */

            boolean isCar = false;
            isCar = true;
            boolean wasCar = isCar ? true : false;
            if(wasCar) {
                System.out.println("wasCar is true");
            }

        }
    }
}
