import java.util.Objects;

public class Customer extends Person{
    private String customerID;
    private double balance;
    public Customer(String name,int age, String username, String password, double balance){
        super(name,age,username,password);
        this.customerID = customerID;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerID);
    }
}
/*- Create Customer class, it should extend Person  class and it
should have extra customerID(auto genarate we will not have it on constructor) and balance.
Required extra functions: getBalance, setBalance and getCustomerID
Overide toString again and print extra customerID
override equals function and check if username and password
 matchs or customerID and password match.  IF any of cases are correct we will return true.
 */
