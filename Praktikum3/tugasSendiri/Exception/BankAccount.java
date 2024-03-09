/*
  File : BankAccount.java   08/03/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas BankAccount yang merupakan suatu akun bank dengan balance, jumlah minimal balance, dan metode-metode akun bank.
 */

public class BankAccount {
  private double balance;
  private final double MIN_BALANCE = 100.0; // Saldo minimal

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: $" + amount);
  }

  public void withdraw(double amount) throws InsufficientFundsException{
    if (this.balance - amount < MIN_BALANCE){
        throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $100.0");
    }
    this.balance -= amount;
    System.out.println("Withdrawn: $" + amount);
  }

  public double getBalance() {
    return balance;
  }
}
