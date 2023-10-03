public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}

/*
OOP is concerned with isolating concepts of a problem domain into separate entities and then using those entities to
solve problems. Concepts relation to a problem can only be considered once theyve been identified.

I.e. we can form abstractions from problems that make those problems easier to approach.

Once concepts related to a given problem have been identified, we can also begin to build constructs that represent
them into programs. These constructs, abd the individual instances that are formed from them i.e., objects,
are used in solving the problem.

"Programs are build from small, clear, and cooperative objects."
 */