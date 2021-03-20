public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesConverter(2500);
    }

    public static void printMegaBytesConverter(int kiloBytes){

        int mb = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB" + " is = to " + mb + " mb and " + remainder + " KB");
    }
}
