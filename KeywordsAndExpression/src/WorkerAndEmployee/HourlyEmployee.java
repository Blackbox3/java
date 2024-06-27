package WorkerAndEmployee;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hirDate, double hourlyPayRate) {
        super(name, birthDate, hirDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPAy() {
        return 40* hourlyPayRate;
    }

    public double getDoublePay(){
          return 2* collectPAy();
    }

}
