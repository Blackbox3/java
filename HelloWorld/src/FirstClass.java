public class FirstClass {

    public static void main(String[] args) {
    double FirstNumber= 20.00d;
    double SecondNumber= 80.00d;
    double addition;
    double remainder;
    addition= FirstNumber + SecondNumber*100.00d;
        System.out.println(addition);
    remainder= addition % 40.00d;
    System.out.println(+remainder);
    boolean iszero= (remainder == 0.00)?true : false;

        System.out.println("is="+iszero);
    if(!iszero)
    {
        System.out.println("got some remainder");
    }
    }
}
