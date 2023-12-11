public class VariableTypes {
  private double balance = 500.00;  // instance variable 
  static int minimumBalance = 200;  // static variable 
  public double getBalance(int accountId) {
    int withdrawal = 500;           // local variable (it can be only used in that nethord/class scope)
    return balance - withdrawal;
  }
  public static void main(String[] args) {
    VariableTypes accnt = new VariableTypes();
    double value = accnt.getBalance(123456);
    //instance variable can be used only when u use it with the object
    System.out.println(accnt.balance);
    System.out.println("The balance is " + value);
    //static variable can be used without the use of object
    System.out.println("The balance is " + minimumBalance);
  }
}
      
