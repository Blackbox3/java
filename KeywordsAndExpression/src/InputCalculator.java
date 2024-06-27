import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            try {
                String number = scanner.nextLine();
                int num = Integer.parseInt(number);
                sum = sum + num;
                System.out.println(num);

            } catch (NumberFormatException nfe) {
                System.out.println("SUM=0 " + "AVG=0");
                ;
            }
            System.out.println();
        }
    }
}