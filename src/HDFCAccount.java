import java.util.UUID;

public class HDFCAccount implements BankInterface {

    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfInterest;

    public HDFCAccount(String name, String password, int balance){
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.rateOfInterest = 3.0;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        balance = balance + amount;
        return "Money credited is " + amount;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(enteredPassword.equals(password)){
            if(amount > balance){
                return "Insufficient balance!!";
            }else{
                balance = balance - amount;
                return "Amount debited" + amount + "Current balance is" + balance;
            }
        }else{
            return "Incorrect Password";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
