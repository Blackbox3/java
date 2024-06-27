package WorkerAndEmployee;

public class Main {
    public static void main(String[] args) {

        Employee Anusha= new Employee("Anusha", "11/11/2002","01/01/2020");
        System.out.println(Anusha);
        System.out.println("Age=" + Anusha.getAge());
        System.out.println("Pay="+Anusha.collectPAy());

        SalariedEmployee bikash= new SalariedEmployee("Bikash","11/11/2002","03/04/2025",35000);
        System.out.println(bikash);
        System.out.println("bikash Paycheck= $"+bikash.collectPAy());

        bikash.retire();
        System.out.println("Bikash Paycheck = $"+ bikash.collectPAy());

        HourlyEmployee anish= new HourlyEmployee("Anish", "20/12/2000","20/12/2030",200);
        System.out.println(anish);
        System.out.println("Anisha PAycheck= $"+anish.getDoublePay());
    }
}
