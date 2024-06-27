package BankAccount;

public class Customer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer( String customerNAme,double creditLimit, String emailAddress )
    {
        this.customerName=customerNAme;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;

        System.out.println("Account details of"+customerName);
        System.out.print("Name:"+customerNAme + " Credit Limit:"+creditLimit + " Email-Address:"+emailAddress);

    }
    public Customer(){
        this("Anusha", 464646.6, "anuskasthacr7@gmail.com");

    }
    public Customer(String customerNAme, String emailAddress)
    {
       this(customerNAme, 544545, emailAddress);
    }
}
