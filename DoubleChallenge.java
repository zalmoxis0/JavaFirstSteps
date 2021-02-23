public class DoubleChallenge {
    /*
    Convert a number of pounds to kilograms.
    STEPS:
        1. Create a variable with the appropriate type to store the nu;ber of pounds to be converted
            to kilograms.
        2. Calculate the result i.e. the nu,ber of kilograms based on the contents of the variable above and
            store the result in a 2nd appropriate variable.
        3. Print out the result.

        Hint: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.
     */

    public static class main{
        public static void main(String[] args) {
           double numberOfPounds = 200;
           double convertedKilograms = numberOfPounds * 0.45359237;
            System.out.println("Converted kilograms are " + convertedKilograms);
        }


    }
}
