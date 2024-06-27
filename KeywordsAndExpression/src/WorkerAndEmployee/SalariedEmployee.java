package WorkerAndEmployee;

public class SalariedEmployee extends Employee{
     double annualSalary;
     boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hirDate, double annualSalary) {
        super(name, birthDate, hirDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPAy() {
        double paycheck= annualSalary/26;
        double adjustPay= (isRetired)? 0.9* paycheck : paycheck;
        return (int) adjustPay;

    }

    public void retire(){
           terminate ("12/12/2025");
           isRetired=true;

    }
}
