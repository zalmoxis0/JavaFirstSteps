public class LeapYearCalculator {
    public static void main(String[] args){
        System.out.println(isLeapYear(2017));
    }

    public static int isLeapYear(int year){
        if((year < 1 || year >9999)){
            System.out.println("It's not a leap year");
        }

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.println(" It's a leap year");
        }

        else {
            System.out.println("It's not a leap year");
        }
        return year;
    }
}
