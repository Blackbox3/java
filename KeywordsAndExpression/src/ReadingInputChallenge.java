import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int sum=0;
int counter=1;
        while(counter <=5){
        System.out.println("Enter number #"+counter);
        String number = scanner.nextLine();

        try {
            int num = Integer.parseInt(number);
            counter++;
            sum= sum+ num;
        }catch(NumberFormatException e)
        {
            System.out.println("Invalid number");
        }
    }
        System.out.println("Sum of the number:"+sum);
        }

}
