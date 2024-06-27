public class SwitchCase {
    public static void main(String[] args) {
        String month = "APRIL";
        System.out.println(month + " in the " + getQuater(month) + " quater");
    }

    public static String getQuater(String month) {
        return switch (month) {
            case "JANUARY", "FEBRAURY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case " JULY" -> "3RD";
            default -> "bad";
        };
    }
}
