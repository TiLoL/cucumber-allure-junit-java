package objects;

public class Account {

    private String accId;
    private double amount;

    public Account(String accId, double amount) {
        this.accId = accId;
        this.amount = amount;
    }

    public String getAccId() {
        return accId;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }

    public void withdraw(double amount) {
        this.amount -= amount;
    }

    public static class Builder {

        private String accId;
        private double amount;

        public Builder setAccId(String accId) {
            this.accId = accId;

            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;

            return this;
        }

        public Account build() {
            return new Account(accId, amount);
        }
    }

}
