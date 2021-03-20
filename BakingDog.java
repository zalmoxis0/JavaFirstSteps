public class BakingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 10));    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (barking && (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));
    }
}