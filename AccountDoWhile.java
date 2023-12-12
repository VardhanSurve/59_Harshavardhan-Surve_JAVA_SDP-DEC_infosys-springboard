import java.util.Scanner;
public class AccountDoWhile {
  public static void main(String[] args) {
    double balance = 0;
    double minbal = 500;
    double depositAmt = 0;
    Scanner sc = new Scanner(System.in); 
    
    do {
      
                           
    //   depositAmt +=100;
      depositAmt = sc.nextInt();  
      System.out.println('$'+depositAmt + " have been added to the account");     
    } while(depositAmt < minbal);
    balance = depositAmt;
    System.out.println("Transaction Complete");
  }
}

