import java.util.Scanner;

public class ParsingAndReadingInput {
    public static void main(String[] args) {
        int currentYear = 2081;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static int getInputFromConsole(int currentYear) {
        String name = System.console().readLine("What is your name?");
        System.out.println("Hi " + name);
        String userDateofBirth = System.console().readLine("When is your born year");
        int age = currentYear - Integer.parseInt(userDateofBirth);
        return (age);
    }

    public static String getInputFromScanner(int currentYear) {
        // String name = System.console().readLine("What is your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);

        // String userDateofBirth= System.console().readLine("When is your born year");
        System.out.println("When is your born year?");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >=" + (currentYear - 125) + "and<=" + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Character not allowed!! Try again.");
            }
        } while (!validDOB);
        return "So you are" + age + "years old";
    }


    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if (dob < minimumYear || currentYear < dob) {
            return -1;
        }

        return currentYear - dob;
    }
}

