//code demonstating class and object 
//class
public class Account {
    //attribute
    private double balance = 500000.00;
    //behavior/methord
    public double  getBalance(int accountId) {
      balance=balance+accountId;
      return balance;
    }
//class
    public static void main(String[] args) {
      Account accnt = new Account();//object
      double value = accnt.getBalance(123456);
      System.out.println("The balance is: " + value);
    }
  }
  