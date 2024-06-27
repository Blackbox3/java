public class MegaConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloByte(5000);
    }
    public static void printMegaBytesAndKiloByte (int kiloBytes)
    {
        int megabytes= kiloBytes / 1024;
        int kilobytes= kiloBytes % 1024;
        System.out.print(kiloBytes + " KB = " + megabytes + " MB " + "and " + kilobytes + " KB ");
    }
}
