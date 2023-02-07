public class BankAccount {

  private double checkingBalance;
  private double savingsBalance;
  private static int numberOfAccounts = 0;
  private static int totalAmount = 0;

  public BankAccount(double checkingBalance, double savingsBalance) {
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    numberOfAccounts++;
  }

  public double getCheckingBalance() {
    return this.checkingBalance;
  };

  public double getSavingsBalance() {
    return this.savingsBalance;
  };

  public void depositChecking(double balance, double amount ){
    amount += checkingBalance;
    totalAmount += checkingBalance;
  };

  public void depositSavings( double amount ){
    amount += savingsBalance;
    totalAmount += savingsBalance;
  };

  public void withdrawChecking(double amount){
    if(checkingBalance > amount ){
      checkingBalance -= amount;
    }
    else {
      System.out.println("Insufficient Funds");
    }
  }

  public void withdrawSavings(double amount){
    if(savingsBalance > amount ){
      savingsBalance -= amount;
    }
    else {
      System.out.println("Insufficient Funds");
    }
  }

  public void balance(){
    System.out.println("Checking balance: "+checkingBalance);
    System.out.println("Savings balance: "+savingsBalance);
  }

}
