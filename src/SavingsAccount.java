public class SavingsAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private Double accountBalance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String showAccountType() {
        return this.getClass().getName();
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return this.accountBalance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return this.accountBalance * (1 + getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account number: " + this.accountNumber + "\n" +
                "Account name: " + this.accountName + "\n" +
                "Account Balance: " + this.accountBalance;
    }

}
