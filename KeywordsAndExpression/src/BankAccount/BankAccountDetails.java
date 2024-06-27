package BankAccount;

public class BankAccountDetails
{

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;

    public BankAccountDetails()
    {
        System.out.println("Empty constructor called");
    }

    public BankAccountDetails(String accountNumber, double balance, String customerName, String email)
    {
        System.out.println("Account constructor with parameter called"+email);
        this.accountNumber= accountNumber;
        this.balance= balance;
        customerName = customerName;
        email=email;

    }

    public BankAccountDetails(String accountNumber, String customerName)
    {
        System.out.println("Account number of the customer and the account name of the curtomer ");
        this.customerName=customerName;
        this.accountNumber=accountNumber;

    }

    public void depositinngFunds(double depositeAmount)
    {
       balance+= depositeAmount;
        System.out.println("Deposit of $" +depositeAmount + "made. New balance is $"+balance);
    }

    public void withdrawlAmount(double withdrawAmount)
    {
      if(balance - withdrawAmount < 0)
      {
          System.out.println("Insufficient Funds. You have only $ "+ balance+"in your account");
      }
      else {
          balance -= withdrawAmount;
          System.out.println("Withdrawl of $"+withdrawAmount + "processes, Remainging balance is $"+balance);
      }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

