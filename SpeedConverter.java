public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(36);
        printConversion(369);
    }
    /*
    =============================================================================================
    =============================================================================================
    1. Write a method called toMilesPerHour that has 1 parameter of type double with the name
    kilometersPerHour. This method needs to return the rounded value of the calculation type long.

    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1
    to indicate an invalid value.

    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it
    =============================================================================================
    =============================================================================================
     */
        public static double toMilesPerHour(double kilometersPerHour){


            if (kilometersPerHour > 0) {
                return (kilometersPerHour / 1.609);
            }
            return -1;
        }

        public static double printConversion (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(kilometersPerHour + " km/h = " + (toMilesPerHour(kilometersPerHour)) + " mi/h");
            return kilometersPerHour;
        }


}


