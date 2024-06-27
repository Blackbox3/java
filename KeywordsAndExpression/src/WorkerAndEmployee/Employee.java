package WorkerAndEmployee;

public class Employee extends Worker {
    private long employeeld;
    private String hirDate;

    private static int employeeNo=1;
    public Employee(String name, String birthDate,String hirDate) {
        super(name, birthDate);
        this.employeeld = Employee.employeeNo++;
        this.hirDate = hirDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeld +
                ", hirDate='" + hirDate + '\'' +
                "} " + super.toString();
    }
}
