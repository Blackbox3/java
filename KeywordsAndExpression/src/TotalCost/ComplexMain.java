package TotalCost;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1.1,2.1);
        complexNumber.add(2.1,2.3);
        complexNumber.add(3.3, 4.2);
        System.out.println(complexNumber);
    }
}
